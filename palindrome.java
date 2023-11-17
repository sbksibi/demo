import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String s = "";      ibi

        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            s = c + s;
        }
        if (s.equals(x))  System.out.println("is palindrome");
        else  System.out.println("is not palindrome");
    }
}
