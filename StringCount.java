import java.util.*;

public class StringCount {

    public static boolean isStringOnlyAlphabet(String str) {

        return ((str != null) && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(scan.nextLine().split(",")));
        ArrayList<Integer> strArr1 = new ArrayList<>();
        int count2 = 0;
        for (int k = 0; k < strArr.size(); k++) {

            if (!isStringOnlyAlphabet(strArr.get(k))) {
                count2 += 1;
            }
        }
        if (count2 == strArr.size()) {
            System.out.println(-1);

        } else {

            for (int i = 0; i < strArr.size(); i++) {
                int count = 0;
                if (isStringOnlyAlphabet(strArr.get(i))) {
                    for (int j = 0; j < strArr.size(); j++) {
                        if (strArr.get(i).equalsIgnoreCase(strArr.get(j)) && strArr.contains(strArr.get(i))) {
                            count += 1;
                        }
                    }
                    strArr1.add(count);
                }

            }
            System.out.print(strArr1);
        }
        scan.close();
    }
}
