package PrefixSums;

import java.util.Scanner;

public class SumOfRectangle {

    static int getSum3(int [][] arr, int r1, int c1, int r2, int c2){
        int sum=0;

         for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }

         }
     return sum;
    }
    static void findpref(int [][] matrix){
        // calculate rowise and column wise sum
        //matrix [i][j]=sumrect((0,0) (i,j))
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
       
    }
     static int getSum4(int [][] arr, int r1, int c1, int r2, int c2){
        int sum=0;

         findpref(arr);
         for(int i=r1;i<=r2;i++){
            if(r2<=1){
                sum+=arr[i][c2]-arr[i][c1-1];
            }
            else{
                sum+=arr[i][c2];
            }
         }
     return sum;
    }
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][] arr=new int[3][3];
        System.out.println("enter elements of  matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter r1,c1,r2,c2");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();    
        int c2=sc.nextInt();
        int sum=getSum3(arr, r1, c1, r2, c2);
        int sum2=getSum4(arr, r1, c1, r2, c2);
        System.out.println("sum is "+sum+" "+sum2);
        sc.close();
}
}
