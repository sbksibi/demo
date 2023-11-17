public class concept{
    public static void main(String[]args){
        int n = 3;
        int i=2;
        if(n>1){
            System.out.println("not prime");
        }
        else if(n%i == 0){
                System.out.println(n + "not prime");
                i++;
            }
        else{
                System.out.println(n + "is prime");
            }
        }
    }