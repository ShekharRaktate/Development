public class Hierachicalinheritance {
    public static void main(String[] args) {
        B hi=new B();
        hi.show();
        hi.setB();
        C hii=new C();
        hii.show();
        hii.setC();
        D hiii=new D();
        hiii.show();
        hiii.setD();

    }
}
class A  {

     void show(){
        System.out.println("Hello Guys!");
    }
}
class B extends A{
    void setB(){
        super.show();
        System.out.println("Hye hai hamara B");
    }
}
class C extends A{
    void setC(){
        System.out.println("Hye hai hamara C");
    }
    
}
class D extends A{
    void setD(){
        System.out.println("Hye hai hamara D");
    }

}