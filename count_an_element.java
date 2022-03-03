import java.util.*;

public class Main{
    public static int binary(int[] arr, int k, int l, int h,int ans){
        
        if(l<=h){
            int mid= l+(h-l)/2;
            if(arr[mid]==k){
                ans+=1;
                int v1= binary(arr, k, l, mid-1, ans);
                int v2= binary(arr, k, mid+1, h, ans-1);
                return ans;
            }
            if(k<arr[mid])
                return binary(arr, k, l, mid-1, ans);

            else
                return binary(arr, k, mid+1, h, ans);
        }
        else
            return 0;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int ans=0;
        int count=Main.binary(arr, k, 0, n-1,ans);
        System.out.print(count);
    }
}