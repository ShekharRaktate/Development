import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap <Integer,String> map=new HashMap<Integer,String>();
        map.put(5, "Mango");
        map.put(2, "Grapes");
        map.put(1, "Banana");
        map.put(3, "Apple");
        map.put(null, "Fruits");
        HashMap <Integer,String> hm=new HashMap<Integer,String>();
        hm.put(10, "any");
        hm.put(4, "yumm!");
        map.putIfAbsent(7, "Raja");
        System.out.println(map);
        System.out.println(hm);
        hm.replace(4,"yumm!","man");
        map.remove(null);
        map.putAll(hm);
        System.out.println(hm);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(map.isEmpty());
        
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.replaceAll((k,v)->"Ajay");
        System.out.println(map);
        // map.clear();
        System.out.println(map);
    }
}
