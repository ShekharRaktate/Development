import java.util.Scanner;
public class ReadingInput2 {
    Scanner sc=new Scanner(System.in);
     int id;
     String name;
     long mobile;
     String address;
    void getData(){
    
        System.out.println("Enter your ID:->");
        id=sc.nextInt();
        System.out.println("Enter your Name:->");
        name=sc.nextLine();    
        System.out.println("Enter your Mobile:->");
        mobile=sc.nextLong();
        System.out.println("Enter your Address:->");
        address=sc.nextLine();
    sc.close();
    }
    void display(){
        System.out.println("ID:->"+id);
        System.out.println("Name:->"+name);
        System.out.println("Mobile:->"+mobile);
        System.out.println("Address:->"+address);
    }

}
