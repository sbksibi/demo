import java.util.ArrayList;
import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        String arr[] = se.nextLine().split(",");
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] < 0) {
                list1.add(arr1[i]);
            } else {
                list2.add(arr1[i]);
            }
        }
        list1.addAll(list2);
        list2.clear();
        for (int i = 1; i < list1.size(); i++) {
            int num1 = list1.get(i - 1), num2 = list1.get(i);
            int diff = num2 - num1;
            if (diff > 1) {
                int front = Math.min(num1, num2), back = Math.max(num1, num2), sum = 0;
                for (int j = front + 1; j < back; j++) {
                    sum += j;
                }
                list2.add(sum);
            } else {
                list2.add(0);
            }
        }
        String res = list2.toString().replace(", ", ",");
        System.out.println(res.substring(1, res.length() - 1));
        se.close();
    }
}