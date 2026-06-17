public class Singleinheritance extends A{
    void get()
    {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        Singleinheritance ob= new Singleinheritance();
        ob.set();
        ob.get();
    }
}
class A {

    int x=10,y=20;
    void set(){
        System.out.println(x+y);
    }
}