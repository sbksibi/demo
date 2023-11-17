public class Demo {
    public static void main(String[] args) {
        int n1 = 5, n2 = 4;
        int count = 0;
        while (n1!=0 || n2!=0) {
            if (n1 > n2) {
                n1 = n1 - n2;
                count+=1;
            } else {
                n1 = n2 - n1;
                count+=1;
            }

        }
        System.out.println(count);
        System.out.println("dvka");
    }
}
