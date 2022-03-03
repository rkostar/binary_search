import java.util.*;

public class pos_of_ele_in_infinite_arr {
    public static int BS(int arr[], int l, int h, int k){

        if(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==k)
                return mid;
            else if(k<arr[mid])
                return BS(arr,l, h-1,k);
            else 
                return BS(arr, l+1, h, k);
        }
        else return -1;
    }
    public static int func(int arr[], int k){
        int l=0, h=1;
        while(h<k){
            h=l;
            h=h*2;
        }
        return BS(arr, l, h, k);
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
