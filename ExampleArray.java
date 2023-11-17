import java.util.Scanner;

/**
 * arraylist
 */
public class ExampleArray {

    public static void main(String[] args) {
        Scanner se =new Scanner(System.in);
        int n =se.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=se.nextInt();
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        se.close();
    }
}