import java.util.*;
import java.io.*;
 
public class Main
{

static int findMissingUtil(int arr[], int low,
                        int high, int diff)
{
    if (high <= low)
        return Integer.MAX_VALUE;
 
    int mid = low + (high - low) / 2;
 
    if (arr[mid + 1] - arr[mid] != diff)
        return (arr[mid] + diff);
 

    if (mid > 0 && arr[mid] -
                arr[mid - 1] != diff)
        return (arr[mid - 1] + diff);
 

    if (arr[mid] == arr[0] + mid * diff)
        return findMissingUtil(arr, mid + 1,
                            high, diff);

    return findMissingUtil(arr, low, mid - 1, diff);
}

static int findMissing(int arr[], int n)
{

    int diff = (arr[n - 1] - arr[0]) / n;
 
 
    return findMissingUtil(arr, 0, n - 1, diff);
}
 
// Driver Code
public static void main (String[] args)
{
  Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr= new int[2*n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
    
    System.out.print(findMissing(arr, n));
}
}