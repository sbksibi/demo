import java.util.*;

public class HasshMap {
    public static void main(String[] args) {
       Map<String, Integer> mp= new HashMap<>();
       mp.put("sibi", 161);
       mp.put("prithivik", 128);
       mp.put("vikas", 187);
       mp.put("udya", 181);

       System.out.println(mp);
        for (String key : mp.keySet()) {
            System.out.println(mp.get(key));
        }
    }
}
 