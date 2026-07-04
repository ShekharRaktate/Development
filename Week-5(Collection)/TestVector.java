import java.util.Iterator;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector <String> v=new Vector<>();
        v.add("Shekhar");
        v.add("Ram");
        v.add("Sai");
        v.add("Shiv");
        Iterator<String> it=v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
