import java.util.*;

public class sortedalphadigit {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ch = "qwertyuioplkjhgfdsazxcvbnm";
        String alpha = "";
        String digits = "";
        for (int i = 0; i < s.length(); i++) {
            if (ch.contains(s.substring(i, i + 1)))
                alpha += s.substring(i, i + 1);
            else
                digits += s.substring(i, i + 1);
        }
        if (alpha.length() == 0 || digits.length() == 0) {
            System.out.println("-1");
        } else {
            char alph[] = alpha.toCharArray();
            char dig[] = digits.toCharArray();
            Arrays.sort(alph);
            Arrays.sort(dig);
            String a = new String(alph);
            String d = new String(dig);
            int a1 = 0, a2 = 0, d1 = 0, d2 = 0, as, ds;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (a.charAt(0) == s.charAt(i)) {
                    a1 = i;
                }
                if (a.charAt(a.length() - 1) == s.charAt(i)) {
                    a2 = i;
                }
                if (d.charAt(0) == s.charAt(i)) {
                    d1 = i;
                }
                if (d.charAt(d.length() - 1) == s.charAt(i)) {
                    d2 = i;
                }
            }
            as = Math.abs(a1 - a2);
            ds = Math.abs(d1 - d2);
            a += Integer.toString(as);
            a += ":";
            as = 0;
            for (int i = 0; i < d.length(); i++) {
                as += Integer.parseInt(d.substring(i, i + 1));
            }
            a += Integer.toString(as);
            a += Integer.toString(ds);
            System.out.println(a);
        }
        sc.close();
    }
}