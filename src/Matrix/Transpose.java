package Matrix;

import java.util.Scanner;

public class Transpose {// only for square matrix
    static void transpose(int [][] matrix ,int r,int c){
        int [] [] changedmatrix=new int [c][r];
        for(int i=0; i<r;i++){
            for(int j=0;j<c;j++){
                changedmatrix[j][i]=matrix[i][j];
            }
        }
    }
    static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("enter rows and columns of first matrix");
            int r=sc.nextInt();
            int c=sc.nextInt();
            int [][] a=new int [r][c];
            System.out.println("enter elements of first matrix");
           print2DArray(a);
            transpose( a, r, c);
            sc.close();
        }

    
    
}
