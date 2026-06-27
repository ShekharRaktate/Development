

public class TestedNestedInterface implements Showable.Message{
    public void show(){
        System.out.println("Showing......");
    }
    public void msg(){
        System.out.println("Messaging.....");
    }
    public static void main(String[] args) {
        TestedNestedInterface obj=new TestedNestedInterface();
        obj.show();
        obj.msg();
    }
}
interface Showable {
    void show();
    interface Message{
        void msg();
    }
    
}
