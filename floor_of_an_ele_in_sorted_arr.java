import java.util.*;

public class floor_of_an_ele_in_sorted_arr {
    public static int func(int[] arr, int k){  // 1 2 5 8
        int l=0, h=arr.length-1,ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k)
                return mid;

            else if(k>arr[mid]){
                ans=mid;
                l=mid+1;
            }
            else
             h=mid-1;
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
    }
}
