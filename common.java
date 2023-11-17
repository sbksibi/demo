import java.util.*;

public class common {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> common = new ArrayList<>();
        
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        
        for (String str: str1.split(",")) {
            list1.add(Integer.valueOf(str));
        }
        
        for (String str: str2.split(",")) {
            list2.add(Integer.valueOf(str));
        }


        for (int i : list1) {
            if (list2.contains(i) && !common.contains(i)) {
                common.add(i);
            }
        }
        
        if (common.size() == 0) {
            System.out.println(-1);
            System.exit(0);
        }

        Collections.sort(common);
        int min = common.get(0), sum = 0; 

        while (min > 0) {
            sum += min%10;
            min /= 10;
        }

        if (sum == 0) {
            System.out.println(-1);
        }else {
            Collections.sort(list1);
            Collections.sort(list2);
            
            String res1 = list1.subList(list1.size()-sum, list1.size()).toString();
            String res2 = list2.subList(list2.size()-sum, list2.size()).toString();

            System.out.println(res1.substring(1, res1.length()-1).replace(", ", ","));
            System.out.println(res2.substring(1, res2.length()-1).replace(", ", ","));
        }
        scan.close();
    }
}
