import java.util.Scanner;

public class Max {
    void maxofarrays(int arr[]){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("max of array is "+ans);
    }
    void multiarraymax(int arr[][]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>ans){
                    ans=arr[i][j];
                }
            }
        }
        System.out.println("max of multi array is "+ans);
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int [][] arr1=new int [3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        Max obj=new Max();
        obj.maxofarrays(arr);
        obj.multiarraymax(arr1);
        sc.close();
    }
}
