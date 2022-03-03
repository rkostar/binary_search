import java.util.*;

public class search_in_sorted_matrix {
    public static int[] func(int[][] matrix, int k){
        int[] arr= new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int i=0,j=matrix[0].length-1;
        while(j>=0){
            if(matrix[i][j]==k){
                arr[0]=i;
                arr[1]=j;
                return arr;
            } 
            if(k<matrix[i][j]){         // if value is less than current index decrement the column
                j--;
            }
            else{
                i++;
            }
        }
        
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        int[][] matrix= new int[n][m];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
                matrix[i][j]=sc.nextInt();
        }

        int arr[]=func(matrix, k);
        System.out.print(arr[0]+" "+arr[1]);
    }
}


