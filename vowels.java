import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class VowelComparator implements Comparator<String>
{
    ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));

    @Override
    public int compare(String s1, String s2) {
        int count1 = 0, count2 = 0;
        for (char ch: s1.toCharArray()) {
            if (vowels.contains(ch)) { count1++; }
        }
        for (char ch: s2.toCharArray()) {
            if (vowels.contains(ch)) { count2++; }
        }
        if (count1 < count2) {
            return -1;
        }else if (count1 > count2) {
            return 1;
        }else {
            return 0;
        }
    }
}

public class vowels {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Hello", "world", "welcome", "hi", "to", "programming"));
        Collections.sort(strings, new VowelComparator());
        System.out.println(strings);
    }
}
