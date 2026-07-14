public class TestThreadJoin extends Thread{
    public void run(){
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            System.out.println("Thread"+i);
        }
    }
    public static void main(String[] args) {
        TestThreadJoin t1=new TestThreadJoin();
        TestThreadJoin t2=new TestThreadJoin();
        TestThreadJoin t3=new TestThreadJoin();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }

}
