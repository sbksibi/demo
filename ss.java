import java.util.*;

public class ss {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        int ans[]=new int[n];
        int odd[]=new int[n];
        int even[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int start=arr[0];
        int evenIndex=0,oddIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[evenIndex]=arr[i];
                evenIndex++;
            }
            else{
                odd[oddIndex]=arr[i];
                oddIndex++;
            }
        }
        int index1=0,index2=0;
        if(start%2==0){
            for(int i=0;i<n;i++){
                if(i%2==0){
                    ans[i]=even[index2];
                    index2++;
                }
                else{
                    ans[i]=odd[index1];
                    index1++;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(i%2==0){
                    ans[i]=odd[index1];
                    index1++;
                }
                else{
                    ans[i]=even[index2];
                    index2++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(i==n-1){
            System.out.print(ans[i]);
        }
        else{
            System.out.print(ans[i]+",");
        }
        scan.close();
    }
}
}