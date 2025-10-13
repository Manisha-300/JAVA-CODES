import java.util.Scanner;

public class Sum {
    void sumofarray(int arr[]){
        int n=arr.length;
        int s=0;
        for(int i=0;i<n;i++){
              s+=arr[i];

        }
        System.out.println("sum of array  "+s);
    }
    void sumofdiagonalArray(int arr[][]){
        int sm=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sm+=arr[i][j];
                }}}
                    System.out.println( "sum of diagonal is "+sm);
                
            
        

    }
    public static void main(String agrs[]){
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
        Sum obj=new Sum();
        obj.sumofarray(arr);
        obj.sumofdiagonalArray(arr1);
        sc.close();
    }
// inputs     2  
// 6   
// 7   
// 6 
// 5 
// 3 4 5 2 
// 3 4 5 1 
// 6 4 2 6
//outputs
// sum of array  26
// sum of diagonal is 9
    
}
