package Asignment;
// Comparable interface3 Example
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
    int id;
    String name;
    int age;
    public Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Student st){
        if(age==st.age){
            return 0;
        }
        else if (age<st.age) {
            return 1;
        }
        else{
            return -1;
        }
    }
}
public class TestSortstudent {
    public static void main(String[] args) {
        
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Shekhar",20));
        al.add(new Student(102,"Yash",14));
        al.add(new Student(104,"Ravi",28));
        Collections.sort(al);
        System.out.println("Sort Elemnet: ");
        for (Student st : al) {
            
            System.out.println("ID: "+st.id+ " Name: "+st.name+" Age: "+st.age);
        }
    }
}
