import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(1, "Mango");
        lhm.put(2, "Banana");
        lhm.put(7, "Apple");
        lhm.put(3, "Apples");
        lhm.put(4, "Orange");
        lhm.put(5, "Mango");
        lhm.put(null, "Grapes");
        System.out.println(lhm);
        for (Map.Entry m : lhm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
