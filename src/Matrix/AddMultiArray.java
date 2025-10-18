package Matrix;
import java.util.Scanner;
public class AddMultiArray {
    static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void addMatrices(int [][] a, int [][] b, int [][] result, int r1, int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows and columns of first matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][] a=new int [r1][c1];
        int [][] b=new int [r1][c1];
        int [][] result=new int [r1][c1];//will store the result of the matrix addition
         System.out.println("enter elements of first matrix");
        System.out.println("enter elements of first matrix");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements of second matrix");
print2DArray(a);
        addMatrices(a, b, result, r1, c1);
        System.out.println("resultant matrix after addition");
        print2DArray(result);
    

sc.close();
    }
}