import java.util.*;

public class Testing {

    public static void main(String[] args) {
        int a1, a2 = 0;
        int digit[] = { 2, 3, 5, 7, 11, 13, 17, 19 };
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < digit.length; i++) {
            for (int j = 1; j < digit.length; j++) {
                a1 = (int) Math.pow(digit[i], j);
                if (49 % a1 == 0) {
                    list.add(digit[i]);
                    list.add(j);
                }
            }
        }
        System.out.println(list);
    }
}
