import java.util.*;

public class minimum_allocation_of_pages {
    public static boolean IsValid(int[] arr, int k, long mid){
        int student=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                student++;
                sum=arr[i];
            }
        }
        if(student==k)
            return true;
        else
            return false;
    }
    public static long func(int[] arr, int k){
        if(k>arr.length)
            return -1;
        long ans=0;
        long h=0;
        for(int val: arr){
            h+=val;
        }
        long l=0;
        for(int i=0;i<arr.length;i++)
            l=Math.max(l,arr[i]);
        while(l<=h){
            long mid=(l+h)/2;
            if(IsValid(arr, k, mid)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int arr[] =new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.print(func(arr,k));
    }
}
