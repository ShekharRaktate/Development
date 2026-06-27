package Assignment;
import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
public class PaymentType {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Creditcard cd=new Creditcard();
        UPI upi=new UPI();
        NetBanking nb=new NetBanking();
        System.out.println("1.CreditCard");
        System.out.println("2.UPI");
        System.out.println("3.NetBanking");
        System.out.println("4.Exit");
        System.out.println("------------------------------");
        System.out.println("Enter your Choice");
        int n=sc.nextInt();

        // switch (n) {
        //     case 1:
        //         System.out.println("");
        //         break;
        //     case 2:
        //         System.out.println();
        //         break;
        //     case 3:
                
        //         break;
        //     case 4:
                
        //         break;
            
            
        //     default:
        //         break;
        // }
        cd.pay(22.70);
        cd.display();
        upi.pay(5562.50);
        upi.display();
        nb.pay(224233.50);
        nb.display();
    }
}
abstract class Payment{
    abstract void pay(double amount);

}
class Creditcard extends Payment{

    @Override
    void pay(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Paying amount:->"+amount);
    }
    void display(){
        System.out.println("paid by using CreditCard");
    } 
}
class UPI extends Payment {

    @Override
    void pay(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Paying amount:->"+amount);
    }
    void display(){
        System.out.println("paid by using UPI");
    } 
}
class NetBanking extends Payment{

    @Override
    void pay(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Paying amount:->"+amount);
    }
    void display(){
        System.out.println("paid by using NetBanking");
    } 
}