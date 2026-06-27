public class Testabstrcat extends Demo {
    
   void  show(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Testabstrcat demo=new Testabstrcat();
        demo.show();
        demo.show1();
        
    }
}
abstract class Demo {

    abstract void show();
    void show1(){
        System.out.println("no-abtract method");
    }
    Demo(){
        System.out.println("Constructor");
    }
    final void showfinal(){
        System.out.println("Final method");
    }
    static void showStatic(){
        System.out.println("Static method");

    }
    static {
        System.out.println("Static Block");
    }
}