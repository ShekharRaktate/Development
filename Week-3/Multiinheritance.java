import java.util.Scanner;
public class Multiinheritance extends B{
    public static void main(String[] args) {
        Multiinheritance ob=new Multiinheritance();
        ob.setShow();
        ob.show();
        ob.get();
    }
    void get(){
        System.out.println("Hello");
    } 
}
class A {
    Scanner sc=new Scanner(System.in);
    int x;
    void show(){
        System.out.println("Enter value X:->");
        x=sc.nextInt();
        System.out.println(x);
    }
}
class B extends A{
    int y=10;
    void setShow(){
        System.out.println(y);

    }
}