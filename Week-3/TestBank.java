public class TestBank {
    public static void main(String[] args) {
        SavingAccount obj=new SavingAccount();
        obj.display();
    }
}
class BankAccount{
    long accno;
    float bal;
}
class SavingAccount extends BankAccount{
    int p=231;
    float r=7.6f;
    int time=3;
    float Si=(p*r*time)/100;

    void display(){
        System.out.println("Acount Number:->"+accno);
        System.out.println("Acount Balance:->"+bal);
        System.out.println("Acount Interest:->"+Si+"%");

    }
    
}