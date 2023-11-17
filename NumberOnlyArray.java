import java.util.*;

public class NumberOnlyArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(scan.nextLine().split(",")));
        ArrayList<String> numberArr = new ArrayList<>(Arrays.asList(scan.nextLine().split(",")));
        ArrayList<String> out1 = new ArrayList<>();      
        ArrayList<String> out2 = new ArrayList<>();

        for (String s: strArr) {
            String number = "";
            String remainder = "";
            for (char ch: s.toCharArray()) {
                if (Character.isDigit(ch)) {
                    number += ch;
                }else {
                    remainder += ch;
                }
            }
            if (numberArr.contains(number)) {
                out1.add(number);
                out2.add(remainder);
            }else {
                out1.add("NA");
                out2.add("NA");
            }
        }
        
        String res1 = out1.toString().replace(", ", ",");
        String res2 = out2.toString().replace(", ", ",");
        
        System.out.println(res1.substring(1, res1.length()-1));
        System.out.println(res2.substring(1, res2.length()-1));

        scan.close();
    }
}