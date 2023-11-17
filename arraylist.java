import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();

        int n=se.nextInt();
        for(int i=0;i<n;i++){
            list1.add(se.nextInt());
        }
      
        System.out.println(list1);
        se.close();
       
    }
}
            