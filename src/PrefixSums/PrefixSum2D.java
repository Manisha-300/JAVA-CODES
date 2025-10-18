package PrefixSums;

import java.util.Scanner;

public class PrefixSum2D {
    // brute force method 
    static int getSum(int [][] arr, int r1, int c1, int r2, int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
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
        int sum=getSum(arr, r1, c1, r2, c2);
        System.out.println("sum is "+sum);
        sc.close();


            
        
    }
    
}
