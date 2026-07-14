class Multi1 extends Thread{
    public void run(){
        for (int i = 0; i < 56; i++) {
            System.out.println("Thread is processing.........");
        }
    }
}

class Multi extends Thread{
    public void run(){
        for (int i = 5; i < 23; i++) {
            System.out.println("Thread is running........."+i);
            // .sleep(1000);
        }
    }
}
public class TestThread{
    public static void main(String[] args) {
        Multi1 t2=new Multi1();
        t2.start();
        Multi t1=new Multi();
        t1.start();

    }
}