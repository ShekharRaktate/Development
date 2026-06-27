public class Abstractimplement extends Test {
    @Override
    void show(){
        System.out.println("Override method");
    }
    void display1(){
        System.out.println("child method");
    }
    public static void main(String[] args) {
        Abstractimplement ob=new Abstractimplement();
        ob.show();
        ob.no(10);
    }
}
abstract class Test  {

    abstract void show();
    private int y=20;
    public void set(){

    }
    Test(){
        System.out.println("constructor");
    }
    public void display(){
        System.out.println("parent method");
    }
    
    int no(int n){
        return n;
    } 

}