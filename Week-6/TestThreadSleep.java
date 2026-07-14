public class TestThreadSleep extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println(e);
                
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestThreadSleep t1=new TestThreadSleep();
        TestThreadSleep t2=new TestThreadSleep();
        t1.start();
        t2.start();
        // t2.start();
        
    }
}
