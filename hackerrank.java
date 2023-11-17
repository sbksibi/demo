import java.util.Arrays;
import java.util.Scanner;

public class hackerrank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int sum = 0, rem;
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        for (int j = 0; j < n; j++) {
            arr2[j] = scan.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j] ){
                    
                    while (arr1[i] > 0) {
                        rem = arr1[i] % 10;
                        sum += rem;
                        arr1[i] = arr1[i] / 10;

                    }

                }
            }
            System.out.println(sum);
        }
        scan.close();
      
    }
}