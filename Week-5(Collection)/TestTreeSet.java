import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) throws NullPointerException{
        TreeSet hs=new TreeSet<>();
        hs.add(1223);
        hs.add("Shekhar");
        hs.add(3434.22);
        hs.add(1223);
        hs.add("Xyz");
        System.out.println(hs);
        Iterator it=hs.iterator();
        while (it.hasNext()) {
            System.err.println(it.next());
        }
    }


}
