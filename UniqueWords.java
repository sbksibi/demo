import java.util.*;

public class UniqueWords {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        String input = scan.nextLine().toLowerCase();
        String arr[] = input.split(",");
        String words[] = new String[arr.length];

        for (int i = 0; i < 1; i++) {
            words = arr[i].split(" ");
            for (int j = 0; j < words.length; j++) {
                for (int k = 1; k < words.length; k++) {
                    if (words[j].compareTo(words[k]) != 0 && !list1.contains(words[j])) {
                        list1.add(words[j]);
                    }
                }
            }
        }
        System.out.print(list1);
        scan.close();
    }
}