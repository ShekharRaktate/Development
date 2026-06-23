public class Multiinheritance2 extends A{
    public static void main(String[] args) {
        Multiinheritance2 ob= new Multiinheritance2();
        ob.show();
    }
    void show(){
        System.out.println("Class Multiinheritance");
        super.show();
    }
}
class A extends B{
    void show(){
        System.out.println("Class A");
        super.show();
    }
}
class B {
    void show(){

        System.out.println("class B");
    }
}