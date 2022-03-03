import java.util.*;

public abstract class minimum_abs_diff_in_sorted_arr {
    public static int func(int []arr, int k){
        int l=0,h=arr.length-1,ans=Integer.MAX_VALUE;

        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k)
                return 0;

            else if(k>arr[mid]){
                ans=Math.min(ans,Math.abs(arr[mid]-k));
                l=mid+1;
            }
            else{
                ans=Math.min(ans,Math.abs(arr[mid]-k));
                h=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();

        int []arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.print(func(arr,k));
        sc.close();

    }
}
