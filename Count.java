import java.util.Scanner;

public class Count {
    static int countofArray(int arr[],int x){
        int c=0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]==x){
            c++;
          }
        }
            return c;   
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        
        System.out.println("count of xis"+countofArray(arr, x));
        sc.close();
    }
//    inputs 3
// 4
// 4
// 4
// 4
// 4
//output
// count of xis4
}
