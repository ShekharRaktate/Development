public class ImplementsEx implements T3 {
    public static void main(String[] args) {
        ImplementsEx Ie=new ImplementsEx();
        Ie.test();
    }
}
interface T1{
    default void test(){
        test3();
    }
    static void test2(){
        
    }
    private void test3(){
        System.out.println("hello");
    }
}
interface T2{

}
interface T3 extends T2,T1{

 }
