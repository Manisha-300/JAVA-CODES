package Matrix;

import java.util.Scanner;

public class GenerateSpiral {
    static int [][] spiralPrint(int n){
        // top row 
        //right col
        // bottom row
        // left col
        int matrix[][]=new int [n][n];
        int totalelements=1;
        int top=0;

         int bottom =n-1;
         int left=0;
         int right=n-1;
        
         while(totalelements <n*n){
            //top-> let col to right col
            // right col - > toprow to bottomrow
            // bottom row -> right col to left col
            // left col -> bottomrow to toprow
            for(int j=left;j<=right && totalelements<n*n;j++){
             matrix[top][j]=
                totalelements++;
            }
            top++;
            for(int i=top;i<=bottom && totalelements<n*n;i++){
                matrix[i][right]

               = totalelements++;

            }
            bottom--;
            for(int j=right;j>=left && totalelements<n*n;j--){
                matrix[bottom][j]=totalelements++;
             }
            left++;
for(int i=bottom;i>=top && totalelements<n*n;i--){
                matrix[i][left]=totalelements++;}
            
            right--;


         }
            return matrix;
    }
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
 
        System.out.println("Spiral Matrix:");
        int[][] result = spiralPrint(n);
for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    sc.close();
    }
}
