public class ImplementsTest implements I3 {
    public void show(){
        System.out.println("Interface I1");
    }
    public void show1(){
        System.out.println("Interface I2");
    }
    public static void main(String[] args) {
        ImplementsTest It=new ImplementsTest();
        It.show();
        It.show1();
    }
}
interface I1{
    int i=10;
    
    void show();

}
interface I2{
    void show1();
}
interface I3 extends I1,I2{
    // public void show(){
    //     System.out.println("Interface I1");
    // }
    // public void show1(){
    //     System.out.println("Interface I1");
    // }
}
