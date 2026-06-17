public class SBIBank {
    public static void main(String[] args) {
        Bank b=new Bank(101, "Shekhar", 100000f);
        b.display();
    }
}
class Bank{
    int id;
    String name;
    float balance;
    Bank(int id ,String name, float balance ){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public void display()
    {
        System.out.println("ID:->"+id);
        System.out.println("Name:->"+name);
        System.out.println("Balance:->"+balance);
    }
}
