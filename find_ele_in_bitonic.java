import java.util.*;

public class find_ele_in_bitonic {
    public static int BSincreasing(int []arr, int l, int h, int k){
        if(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k)
                return mid;
            else if(k<arr[mid])
                return BSincreasing(arr, l, mid-1, k);
            else
                return BSincreasing(arr, mid+1, h, k);
        }
        else
            return -1;
    }
    public static int BSdecreasing(int []arr, int l, int h, int k){
        if(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k)
                return mid;
            else if(k<arr[mid])
                return BSdecreasing(arr, mid+1, h, k);
            else
                return BSdecreasing(arr, l, mid-1, k);
        }
        else
            return -1;
    }
    public static int maxPos(int[]arr, int l, int h){
        if(l<=h){
            int mid=(l+h)/2;
            
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1])
                return maxPos(arr, mid+1, h);
            else 
                return maxPos(arr, l, mid-1);
        }
        else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int pos=maxPos(arr, 0, n-1);
        int index1=BSincreasing(arr, 0, pos-1, k);
        int index2=BSdecreasing(arr, pos, n-1, k);
        if(index1==index2)
            System.out.println(index1);
        else{
            System.out.println(index1+index2+1);
        }
    }
}
