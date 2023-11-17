import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        String sample = "this is a sample string";

        HashMap<Character, Integer> map = new HashMap();

        for (char ch : sample.toCharArray()) {
            if (ch == ' ')
                continue;
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }

        System.out.println(map);
    }
}
