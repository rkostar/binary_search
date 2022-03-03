import java.util.*;

public class Main {
    public static int func(int[] arr){
        int l=0, h=arr.length-1;
        if(h==0)
            return 0;
        if(arr[l]<arr[h])
            return l;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]<arr[(mid+1)%arr.length] && arr[mid]<arr[(mid+arr.length-1)%arr.length]){
                ans= mid;
                break;
            }
            else if(arr[mid]<arr[h]){
                h=mid-1;
            }
            else if(arr[mid]>arr[l])
                l=(mid+1);
                
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println(func(arr));
    }
}
