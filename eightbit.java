import java.util.ArrayList;
import java.util.Scanner;

public class eightbit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        String str1 = scan.nextLine();
        char arr[] = str1.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            int ch = (int) arr[i];
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57) || ch == 43 || ch == 47) {
                continue;
            }
            System.out.println(-1);
            System.exit(0);
        }

        for (int i = 0; i < arr.length; i++) {
            String b = Integer.toBinaryString((int) arr[i]);
            list1.add(String.format(leftPadding(b, '0', 8)));
        }

        StringBuilder sb = new StringBuilder();
        for (String binaryValue : list1) {
            sb.append(binaryValue);
        }
        String value = sb.toString();

        while(value.length() % 6 != 0) {
            value+="0";
        }

        int groupSize = 6;
        int length = value.length();

        for (int i = 0; i < length; i += groupSize) {
            int endIndex = Math.min(i + groupSize, length);
            String group = value.substring(i, endIndex);
            list2.add(group);
        }

        for (String bString: list2) {
            list3.add(Integer.parseInt(bString,2));
        }

        String res = "";
        for (int i: list3) {
            res += getMappedChar(i);
        }
        System.out.println(res);
        scan.close();
    }

    // Maps a decimal value to its corresponding character
    private static char getMappedChar(int decimal) {
        if (decimal >= 0 && decimal <= 25) {
            return (char) ('A' + decimal);
        } else if (decimal >= 26 && decimal <= 51) {
            return (char) ('a' + decimal - 26);
        } else if (decimal >= 52 && decimal <= 61) {
            return (char) ('0' + decimal - 52);
        } else if (decimal == 62) {
            return '+';
        } else {
            return '/';
        }
    }
    
    public static String
    leftPadding(String input, char ch, int L)
    {
        String result
            = String
  
                  // First left pad the string
                  // with space up to length L
                  .format("%" + L + "s", input)
  
                  // Then replace all the spaces
                  // with the given character ch
                  .replace(' ', ch);
  
        // Return the resultant string
        return result;
    }
}