public class Main {
    public static void main(String[] args) {
        A oa=new A();
        oa.setData();
        oa.display();
        System.out.println("-------------------");
        new A().setData();
        new A().display();
        
    }
}
