package Matrix;

import java.util.Scanner;

public class Spiral {
    static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void spiralPrint(int [][]matrix,int r, int c){
        // top row 
        //right col
        // bottom row
        // left col
        int top=0;
         int bottom =r-1;
         int left=0;
         int right=c-1;
         int totalelements=0;
         while(totalelements <r*c){
            //top-> let col to right col
            // right col - > toprow to bottomrow
            // bottom row -> right col to left col
            // left col -> bottomrow to toprow
            for(int j=left;j<=right && totalelements<r*c;j++){
                System.out.print(matrix[top][j]+" ");
                totalelements++;
            }
            top++;
            for(int i=top;i<=bottom && totalelements<r*c;i++){
                System.out.print(matrix[i][right]+" ");

                totalelements++;

            }
            bottom--;
            for(int j=right;j>=left && totalelements<r*c;j--){
                System.out.print(matrix[bottom][j]+" ");
                totalelements++;
             }
            left++;
for(int i=bottom;i>=top && totalelements<r*c;i--){
                System.out.print(matrix[i][left]+" ");
                
                totalelements++;}
            
            right--;

         }

    }
    public static void main(String[] args) {
        
Scanner sc= new Scanner(System.in);
    System.out.println("enter rows and columns of first matrix");
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int [][] a=new int [r1][c1];
    System.out.println("enter elements of first matrix");
    for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            a[i][j]=sc.nextInt();
        }
        print2DArray(a);
    }
    spiralPrint( a, r1, c1);
   
    sc.close();
}
    
}
