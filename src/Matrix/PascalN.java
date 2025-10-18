package Matrix;

import java.util.Scanner;

public class PascalN {
    //jacked array - array  which have different number of columns in each rows 
     static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
  static int[][] pascal(int n){
    int [][] p=new int [n][];
    for(int i=0;i<n;i++){
        p[i]=new int [i+1];
        //ith row has i+1 elements
        /*
       p[0]=new int [1];
         p[1]=new int [2];...
        */ 
        p[i][0]=p[i][i]=1;//first and last elements of each row is 1
        for(int j=1;j<i;j++){
            p[i][j]=p[i-1][j-1]+p[i-1][j];
        }
    }
    return p;
        
  } 



      public static void main(String[] args) {
        
Scanner sc= new Scanner(System.in);
    System.out.println("enter rows and columns of first matrix");
    int r1=sc.nextInt();
    int [][] a=new int [r1][];
    
    pascal( r1);
    print2DArray(a);
sc.close();
}
}
