import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < args.length; i++) {
            
        }
        ll.add("Ravi");
        ll.add("Ram");
        ll.add("Sita");
        ll.add("Laxman");
        ll.add("Shekhar");
        ll.add("Hanuman");
        ll.offer("Ram");
        System.out.println(ll);
        ll.getFirst();
        ll.getLast();
        System.out.println(ll.indexOf("Hanuman"));
        ll.addFirst("Sanket");
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        Iterator <String>it=ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
