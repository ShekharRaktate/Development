public class TestMyThread{
    public static void main(String[] args) {
        Table table=new Table();
        MyThread1 mt1=new MyThread1(table, 3);
        MyThread2 mt2=new MyThread2(table, 5);
        mt1.start();
        mt2.start();
    }
}
class Table {
    synchronized void printTable(int n){
        for (int i = 1; i <=10; i++) {
            
            System.out.println(n+"*"+i+"="+i*n);
        }
    }
}
class MyThread1 extends Thread{
    Table table=new Table();
    int num;
    MyThread1(Table table,int num){
        this.table=table ;
        this.num=num;
    }
    public void run(){
        table.printTable(num);
    }

}
class MyThread2 extends Thread{
    Table table=new Table();
    int num;
    MyThread2(Table table,int num){
        this.table=table ;
        this.num=num;
    }
    public void run(){
        table.printTable(num);
    }

}