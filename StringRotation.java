import java.util.ArrayList;
import java.util.*;

public class StringRotation {
    static String leftrotate(String str1, int n) {

        String temp = str1 + str1;
        int l1 = str1.length();

        String Lfirst = temp.substring(n, n + l1);

        return Lfirst;
    }

    static String rightrotate(String str1, int n) {
        return leftrotate(str1, str1.length() - n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] in = sc.nextLine().split(",");
            strings.add(in[0]);
            numbers.add(Integer.parseInt(in[1]));
        }
        for (int i = 0; i < strings.size(); i++) {
            String rotate = rightrotate(strings.get(i), numbers.get(i));
            String temp = "";
            for (int j = 1; j <= rotate.length(); j += 2) {
                if (j < rotate.length()) {
                    char a = rotate.toCharArray()[j];
                    if (a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u' && a != 'A' && a != 'E' && a != 'I' && a != 'O' && a != 'U') {
                        temp += a;
                    }
                }
            }
            if( temp.length() > 0){
                last.add(temp);
            }
        }
        Collections.sort(last, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                } else {
                    return s1.compareTo(s2);
                }
            }
        });
        String res = last.toString().replace(", ", ",");
        if (res.length() > 1) {
            System.out.println(res.substring(1, res.length()-1));
        } else {
            System.out.println("-1");
        }
    }
}