package Matrix;

import java.util.Scanner;

public class Multiply {
    
    static void  multiplyMatrices(int [][] a, int [][] b, int [][] result, int r1, int c1, int c2){
       if (c1 != b.length) {
            throw new IllegalArgumentException("Incompatible matrix dimensions for multiplication.");
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                result[i][j]=0;
                for(int k=0;k<c1;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
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
        }
             multiplyMatrices(a, a, a, r1, c1, c1);
        System.out.println("resultant matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(a[i][j]+" ");}
            }
    
    
    
    
            }



    
}
