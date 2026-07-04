import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> qu=new LinkedList<>();
        qu.add("Shekhar ");
        qu.add("Annasaheb ");
        qu.add("Raktate");
        System.out.println(qu);
        String st=qu.peek();
        System.out.println("Accessed element : "+st);
        String str2=qu.poll();
        System.out.println("Remove element "+str2);
        System.out.println(qu);
        qu.offer("Shekhar");
        System.out.println("After Offer:="+qu);



    }
}
