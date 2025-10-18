package PrefixSums;

import java.util.Scanner;

public class PreCal2 {
    
    //Alternate method 3
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
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }
    static int getsum3(int [][] arr, int r1, int c1, int r2, int c2){
        int sum=0;
        int ans=0;
        sum=arr[r2][c2];
       int up=0,left=0,leftup=0;
      findpref(arr);
      sum=arr[r2][c2];
      if(r1>=1){
      left=arr[r2][c1-1];
      }
        if(c1>=1){
            up=arr[r1-1][c2];
        }
        if(r1>=1 && c1>=1){
            leftup=arr[r1-1][c1-1];
        }
     ans = sum - left - up + leftup;
     return ans;
     

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
        int sum=getsum3(arr, r1, c1, r2, c2);
        System.out.println("sum is "+sum);
        sc.close();
    }

}
