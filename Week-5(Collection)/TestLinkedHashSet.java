import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet hs=new LinkedHashSet<>();
        hs.add(1223);
        hs.add("Shekhar");
        hs.add(3434.22);
        hs.add(3434.22);
        // hs.add(null);
        hs.add(null);
        hs.add("Xyz");
        System.out.println(hs);
        Iterator it=hs.iterator();
        while (it.hasNext()) {
            System.err.println(it.next());
        }
    }

}
