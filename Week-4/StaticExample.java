public class StaticExample {
    public static void main(String[] args) {
        Student s1=new Student(11, "Shekhar");
        Student s2=new Student(110, "om");
        Student s3=new Student(101, "Ram");
        s1.display();
        s2.display();
        s3.display();
        
    }
}
class Student{
    int rollno;
    String name;
    static String college="Abc";
    Student(int r,String n){
        rollno=r;
        name=n;

    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);

    }

}