public class TestRunnable implements Runnable {
    public void run(){
        System.out.println("Now the thraed is running.......");
    }
    public static void main(String[] args) {
        Runnable r=new TestRunnable();
        Thread t=new Thread(r," My new Thread");
        t.start();
        System.out.println(t.getName());
    }
}
