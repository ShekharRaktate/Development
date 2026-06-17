public class Parameters{
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
        this(id,name);
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    Bank(int id, String name){
        this(id);
        System.out.println("Iam 2 parameterized contructor");
    }
    Bank(int id){
        this();
        System.out.println("Iam 1 parameterized contructor");
    }
    Bank(){
        System.out.println("Iam Default constructor");
    }

    public void display()
    {
        System.out.println("ID:->"+id);
        System.out.println("Name:->"+name);
        System.out.println("Balance:->"+balance);
    }
    
}
