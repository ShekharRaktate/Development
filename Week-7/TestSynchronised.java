class Test1{
    synchronized static void printTable(int n){
        for (int i = 1; i <=10; i++) {
            System.out.println(i*n);
        }
    }
}
class MyThread1 extends Thread{
    public void run(){
        Test1.printTable(2);
    }
}
class MyThread2 extends Thread{
    public void run(){
        Test1.printTable(3);
    }
}
class MyThread3 extends Thread{
    public void run(){
        Test1.printTable(5);
    }
}
class MyThread4 extends Thread{
    public void run(){
        Test1.printTable(7);
    }
}





public class TestSynchronised {
    public static void main(String[] args) {
        MyThread1 mt1=new MyThread1();
        MyThread2 mt2=new MyThread2();
        MyThread3 mt3=new MyThread3();
        MyThread4 mt4=new MyThread4();
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        
    }
}
