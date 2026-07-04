import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class TestArraylist {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        // Scanner sc=new Scanner(System.in);
        list.add("Shekhar");
        list.add("om");
        list.add("Sai");
        list.add("Sai");
        list.add("Ram");
        list.add(null);
        list.set(2, "Sarthak");
        list.remove(0);
        System.out.println(list);
        ListIterator<String> it=list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        System.out.println("---------------------");
        for (int i = 0; i < list.size()-1; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------");
        list.forEach(a->System.out.println(a));//foreach loop using lambda expression of java8 features
        Iterator <String> itr=list.iterator();
        itr.forEachRemaining(a->
            //foreach loop using lambda expression of java8 features
        {
            System.out.println(a);
        });
    }
}