import java.util.*;

public class single_element_in_a_sorted_array {
    public static int func(int[]arr){
        int n= arr.length;
        if(n==1)
            return arr[0];
        if(arr[0]!=arr[1])
            return arr[0];

        if(arr[n-1]!=arr[n-2])
            return arr[n-1];
            
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid]==arr[mid-1] && (mid)%2!=0 || arr[mid]==arr[mid+1] && (mid)%2==0)
                l=mid+1;

            else
                h=mid-1;
        }
        return -1;
    
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.print(func(arr));
        sc.close();
    }
}
