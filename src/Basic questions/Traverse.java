import java.util.*;
public class Traverse {
    void travarr(int arr []){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        //using while loop
        int i=0;
        while(i<n){
            System.out.println(arr[i]);
            i++;
        }

    }
    void multitrav(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int [][] arr2={{2,4,3,5},{2,4,2,2},{3,5,6,7}};
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr2[i][j]+" ");
            }
        }

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
        Traverse obj=new Traverse();
        obj.travarr(arr);
        obj.multitrav(arr1);
        sc.close();
    }
    
}
