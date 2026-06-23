public class Student{
    int rollno;
    String name;
    String city;
    Student(int rollno,String name,String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;

    }
    public String toString() {
        return "Student:-> rollno= " + rollno +", name= " + name +", city= " + city;
    }
    public void main(String[] args) {
        Student s1=new Student(1, "Shekhar", "Shirdi");
        System.out.println(s1);
    }
}

