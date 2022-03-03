import java.util.*;

public class Main {
    public static int func(int arr[]){
        int l=0, h=arr.length-1;

        while(l<=h){
            int mid=(l+h)/2;

            if(mid>0 && mid<arr.length-1){
                if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
                    return mid;

                else if(arr[mid]<arr[mid+1])
                    l=mid+1;

                else
                    h=mid-1;
            }
            else if(mid==0){
                if(arr[mid]>arr[mid+1])
                    return mid;
                else return mid+1;
            }

            else{
                if(arr[mid]>arr[mid-1])
                    return mid;
                else
                    return mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int []arr= new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.print(func(arr));
    }   
}
