// here the ith element may lie at ith, (i+1)th or (i-1)th position
// 1 2 4 3 5  --> here 3 should be at 2nd pos, but its in 3rd pos.

import java.util.*;

public class search_in_nearly_sorted_array {
    public static int func(int[] arr, int k){
        int n=arr.length;
        int l=0, h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k)
                return mid;
            if(mid+1<=h && arr[mid+1]==k)
                return mid+1;
            if(mid-1>=0 && arr[mid-1]==k)
                return mid-1;

            if(k<arr[mid])
                h=mid-2;
            else
                l=mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.print(func(arr, k));
        sc.close();
    }
}
