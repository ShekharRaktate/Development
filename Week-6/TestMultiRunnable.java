public class TestMultiRunnable implements Runnable{
    public void run(){
        System.out.println("Hello Guys!");
    }
    public static void main(String[] args) {
        TestMultiRunnable m=new TestMultiRunnable();
        Thread t=new Thread(m);
        t.start();
    }
}