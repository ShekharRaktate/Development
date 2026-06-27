public class OuterStatic {
    
    static int data=240;
    static class Inner{
        void msg(){
            System.out.println("Data is "+data);
        }
        void msg1(){
            System.out.println("Data is "+data);
        }
    }
    public static void main(String[] args) {
        OuterStatic.Inner data=new Inner();
        data.msg();
        data.msg1();
    }
}
