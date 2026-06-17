// lesson about the overriding
public class Singleinheritance2 extends A{
    void set()
    {
        System.out.println("Java");
        super.set();//we want to know
    }
    public static void main(String[] args) {
        Singleinheritance2 ob= new Singleinheritance2();
        ob.set();
    }
}
class A {

    void set(){
        System.out.println("Hello");
    }
}