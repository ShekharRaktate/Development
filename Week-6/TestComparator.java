import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int roll;
    String name;
    String city;
    public Student(int roll,String name,String city){
        this.roll=roll;
        this.name=name;
        this.city=city;
    }
    public String toString(){
        return this.roll+ " "+this.name+ " "+this.city;
    }
}
/**
 * Sortbyrollno
 */
class Sortbyrollno implements Comparator<Student> {

    public int compare(Student a,Student b){
        return a.roll-b.roll;
    }
}
class SortbyName implements Comparator<Student> {

    public int compare(Student a,Student b){
        return a.name.compareTo(b.name);
    }
}
public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Student> st= new ArrayList<Student>();
        st.add(new Student(101, "Sai", "Pune"));
        st.add(new Student(132, "Ram", "Dheli"));
        st.add(new Student(145, "Sita", "Mumbai"));
        st.add(new Student(100, "Annad", "Indore"));
        System.out.println("Unsorted: ");
        for (Student student : st) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Sorted by rollno: ");
        Collections.sort(st,new Sortbyrollno());
        for (Student student : st) {
            System.out.println(student);
        }
        System.out.println();
        System.out.println("Sorted by Name: ");
        Collections.sort(st,new SortbyName());
        for (Student student : st) {
            System.out.println(student);
        }
    }
}