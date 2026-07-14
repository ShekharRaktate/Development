public class TestTotalNotifyall {
    public static void main(String[] args) throws InterruptedException {
        Total t=new Total();
        t.start();
        synchronized(t){
            t.wait();
            System.out.println("Total Sum: "+t.sum);
        }
    }
}
class Total extends Thread{
    int sum=0;
    public void run(){
        synchronized(this){
            for (int i = 1; i <=10; i++) {
                sum+=i;
            }
        }
        // this.notify();
    }
    
}