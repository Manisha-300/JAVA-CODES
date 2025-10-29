package Matrix;

import java.util.Scanner;

public class Rotate90 {

      static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int [][] transpose(int [][] matrix ,int r,int c){
        int [] [] changedmatrix=new int [c][r];
        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                changedmatrix[j][i]=matrix[i][j];
            }
        }
        return changedmatrix;
    }
    static void revarr(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void rotate90degrees(int [][] matrix,int r,int c){
        // first transpose the matrix
        int[][] transposed = transpose(matrix, r, c);

        // Step 2: reverse each row of transposed matrix
        for (int i = 0; i < transposed.length; i++) {
            revarr(transposed[i]);
        }
        print2DArray(transposed);
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

        }
        rotate90degrees( a, r1, c1);


    sc.close();
}
}
