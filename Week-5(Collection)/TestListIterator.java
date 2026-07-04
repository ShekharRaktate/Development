import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        ArrayList <Character> al=new ArrayList<>();
        al.add('A');
        al.add('B');
        al.add('C');
        al.add('D');
        System.out.println("Original list: "+al);
        ListIterator<Character> li=al.listIterator();
        System.out.println("Forward direction");
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println("Backward direction");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        System.out.println("Index: ");
        System.out.println("Next Index: "+li.nextIndex());
        System.out.println("Previous Index: "+li.previousIndex());
        li.next(); //move to first element
        li.set('a');
        System.out.println("After Set: "+al);
        li.add('E');
        System.out.println("After Add: "+al);
        li.next();
        li.remove();
        System.out.println("After remove: "+al);
        System.out.println("final List:");
        ListIterator<Character> li1=al.listIterator();
        while (li1.hasNext()) {
            System.out.println(li1.next());
        }

    }
}
