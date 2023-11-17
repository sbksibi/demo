import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j==n-1){
                System.out.print(i + "" + j + " ");
                 }
                 else{
                    System.out.print("   ");
                 }
        }
            System.out.println("");
        }
        se.close();

    }
}

// 5
//             04 
//          13
//       22
//    31
// 40