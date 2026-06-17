import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Banks b=new Banks();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter withdrawal amount");
        float a=sc.nextFloat();
        System.out.println("Enter Deposited  amount");
        float c=sc.nextFloat();

        b.setDeposit(c);
        b.setWithdraw(a);
        System.out.println("----------------------");
        System.out.println("Withdrawal amount:->"+b.getWithdraw());
        System.out.println(" Deposit amount:->"+b.getDeposit());
        sc.close();
    }
}
class Banks{
    private float withdraw;
    private float deposit;
    public void setWithdraw(float withdraw){
        this.withdraw=withdraw;

    }
    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }
    public float getWithdraw() {
        return withdraw;
    }
    public float getDeposit() {
        return deposit;
    }
}