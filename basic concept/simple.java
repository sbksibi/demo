import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       char[] a= sc.nextLine().toCharArray();
       char[] b= sc.nextLine().toCharArray();
       ArrayList<Character> first= new ArrayList<>();
       ArrayList<Character> second= new ArrayList<>();
       ArrayList<Character> duplicate= new ArrayList<>();
      
       for (Character ch : a) {
            first.add(ch);
       }
       for (Character ch : b) {
            second.add(ch);
       }
       for (char ch : first) {
        if (second.contains(ch)) {
            duplicate.add(ch);
        }
       }
       System.out.println(duplicate);
       for (Character character : duplicate) {
            first.remove(character);
            second.remove(character);
       }
       System.out.println(first);
       System.out.println(second);
    }
}