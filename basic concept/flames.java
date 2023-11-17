// import java.util.Scanner;

// public class flames {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         String first=sc.nextLine();
//         String second=sc.nextLine();
//         char[] ch1=first.toCharArray(); 
//         char[] ch2=second.toCharArray(); 
//         for(int i=0;i<ch1.length;i++){
//             for(int j=0;j<ch2.length;j++){
//                 if(ch1[i]!=ch2[i]){

//                 }
//             }
//         }
//         for (char c : ch1) {
//             System.out.print(c);
//         }
//         for (char d : ch2) {
//             System.out.print(d);
//         }
//     }
// }
import java.util.Scanner;

public class flames {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter the second name:");
        String name2 = scanner.nextLine();
        System.out.println("The relationship between " + name1 + " and " + name2 + " is: " + calculateFlames(name1, name2));
        scanner.close();
    }

    public static String calculateFlames(String name1, String name2) {
        // Remove common letters
        String name1NoCommonLetters = name1.replaceAll("[" + name2 + "]", "");
        String name2NoCommonLetters = name2.replaceAll("[" + name1 + "]", "");
        int totalLetters = name1NoCommonLetters.length() + name2NoCommonLetters.length();
        
        // Create the FLAMES array
        char[] flamesArray = { 'F', 'L', 'A', 'M', 'E', 'S' };
        
        // Iterate through the FLAMES array and cross out letters
        int index = 0;
        for (int i = 0; i < flamesArray.length - 1; i++) {
            int count = 0;
            for (int j = index; count < totalLetters - 1; j++) {
                if (j == flamesArray.length) {
                    j = 0;
                }
                if (flamesArray[j] != '-') {
                    count++;
                }
                index = j;
            }
            flamesArray[index] = '-';
        }
        
        // Find the remaining letter and return the corresponding relationship
        char relationship = ' ';
        for (char c : flamesArray) {
            if (c != '-') {
                relationship = c;
            }
        }
        switch (relationship) {
            case 'F':
                return "Friends";
            case 'L':
                return "Lovers";
            case 'A':
                return "Affectionate";
            case 'M':
                return "Marriage";
            case 'E':
                return "Enemies";
            case 'S':
                return "gay";
            default:
                return "Invalid";
        }
    }
}
