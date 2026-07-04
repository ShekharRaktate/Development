import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
        hs.add(1223);
        hs.add("Shekhar");
        hs.add(3434.22);
        hs.add("Xyz");
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        Iterator it=hs.iterator();
        while (it.hasNext()) {
            System.err.println(it.next());
        }
    }
}
