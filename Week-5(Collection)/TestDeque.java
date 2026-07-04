import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class TestDeque {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<>();
        dq.addFirst("Shekhar");
        dq.offer("Sai");
        dq.add("Sai");
        dq.addLast("Ram");
        System.out.println(dq);
        dq.removeLast();
        for(String str:dq){
            System.out.println(str);
        }
        Iterator it=dq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
