import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        int n = se.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                System.out.print(i + "" + j + " ");
                 }
                 else{
                    System.out.print("   ");
                 }
        }
            System.out.println("");
        }
        // se.close();

    }
}


// 5
// 00
//    11
//       22
//          33
//             44