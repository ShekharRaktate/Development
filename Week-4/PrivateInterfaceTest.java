

public class PrivateInterfaceTest implements Myinterface,Myinterface1{
    @Override
    public void show() {
        // TODO Auto-generated method stub
        // Myinterface.super.show();
        // Myinterface1.super.show();
        System.out.println("okay");

    }
    public static void main(String[] args) {
        PrivateInterfaceTest pt=new PrivateInterfaceTest();
        pt.show();
    }
}
interface Myinterface{
    default void show(){
        msg();
    }
    private static void msg(){
        System.out.println("private static method inside interface");
    }
}
interface Myinterface1{
    default void show(){
        System.out.println("hi side");
    }
}