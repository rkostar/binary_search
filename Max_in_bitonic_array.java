import java.util.*;

public class Max_in_bitonic_array {
    public static int func(int arr[]){
        int l=0,h=arr.length-1,ans=0;
        while(l<=h){
            int mid=(l+h)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                ans=arr[mid];
                break;
            }
            else if(arr[mid]<arr[mid+1])
                l=mid+1;
            else
                h=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.print(func(arr));
        sc.close();
    }
}