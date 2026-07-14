public class TESTthrow {
    static void enrollStudent(int age,int weight){
        if (age<12 && weight>40) {
            throw new ArithmeticException("Student is not eligible for enrollment");
            
        } else {
            System.out.println("Student enroll successfully");
        }
    }
    public static void main(String[] args) {
        System.out.println("Student registation process: ");
        enrollStudent(55,55);
        System.out.println("Have a nice day");
    }
}
