public class TestStartMultiThread {
    public static void main(String[] args) {
        Thread t=new Thread("Shekhar");
        t.start();
        
        System.out.println(t.getName());
    }
}