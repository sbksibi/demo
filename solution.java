import java.util.*;

public class solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        if(s==""){
            System.out.println(s.length());
        }
        else{

        String[] tokens = s.trim().split("[ !,?._'@]+");
        if (tokens.length>0){
        System.out.println(tokens.length);
         for (String token : tokens) {
            System.out.println(token);
        }}
        else{
            System.out.println("0");
        }}

       
    }
}
