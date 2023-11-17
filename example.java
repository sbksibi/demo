/**
 * example
 */
public class example {

    public static void main(String[] args) {

        int num = 1020; // int number
        int sum = 0;
        while (num > 0) {
            int rem=num%10;
            sum+=rem;
            num=num/10;
           
        }
        System.out.println(sum);
    }
}