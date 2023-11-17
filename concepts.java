import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class concepts {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7, 8);

        Scanner scan = new Scanner(System.in);
        int i =scan.nextInt();
        ArrayList<String> numberArr = new ArrayList<>(Arrays.asList(scan.nextLine().split(",")));
        for (int n : nums) {
            System.out.print(n);
        }
        System.out.println("");
        nums.forEach(n -> System.out.print(n));
        System.out.println("");
        Stream<Integer> data = nums.stream();
        Stream<Integer> mappedData = data.map(n -> n * 2);
        mappedData.forEach(n -> System.out.print(n));
        scan.close();
    }

    }

    Iterator<Integer> i = listname.Iterator();System.out.println(i.next());

    Iterator<Integer> i = listname.Iterator();while(i.hasNext()){
System.out.println(i.next());
}