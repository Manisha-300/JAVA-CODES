package Matrix;

import java.util.Scanner;

public class MultidimensionArray {

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
    sc.close();
    
}
}
