import java.util.Iterator;
import java.util.PriorityQueue;

public class TestProrityqueue {
    public static void main(String[] args) {
        PriorityQueue <String> pq=new PriorityQueue<>();
        pq.offer("Shekhar");
        pq.offer("Sujit");
        pq.offer("Sanket");
        pq.offer("Omkar");
        // pq.offer(null);
        pq.offer("Omkar");
        pq.add("arpit");
        System.out.println(pq);
        System.out.println("head:"+pq.element());
        System.out.println("head:"+pq.peek());
        pq.remove();
        pq.poll();
        Iterator it=pq.iterator();
        while (it.hasNext()) {
           
            System.out.println( it.next());
        }


    }
}
