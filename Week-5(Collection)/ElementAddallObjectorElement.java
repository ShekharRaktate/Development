import java.util.Iterator;
import java.util.LinkedList;

public class ElementAddallObjectorElement {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Shekhar");
        ll.add("Ram");
        ll.add("Sai");
        ll.add("Sita");
        ll.add(null);
        System.out.println(ll);
        LinkedList<String> ll1=new LinkedList<>();
        
        ll1.add("Samrath");
        ll1.add("Sham");
        ll1.add("Shiv");
        System.out.println(ll1);
        ll.addAll(ll1);
        System.out.println(ll);
        LinkedList<String> ll2=new LinkedList<>();
        
        ll2.add("A");
        ll2.add("Sai");
        ll2.add("Ram");

        System.out.println(ll2);
        ll.addAll(2,ll2);
        System.out.println(ll);
        ll.addFirst("Hi! ");
        ll.addLast(" Bye");
        System.out.println(ll);
        ll.removeAll(ll1);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirstOccurrence("Sai");
        ll.removeLastOccurrence("Ram");
        System.out.println(ll);
        Iterator<String> i=ll.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        ll.clear();
        System.out.println(ll);
    }
}
