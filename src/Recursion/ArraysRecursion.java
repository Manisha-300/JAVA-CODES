import java.util.Scanner;

public class ArraysRecursion {
    static void printArr(int [] arr,int idx ){
        if(idx== arr.length){
            return;
        }
            System.out.println(arr[idx]);
            printArr(arr, idx+1);
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        int []arr= {5,6,7,8,9};
        
       // int i=sc.nextInt();
        printArr(arr, 0);
       sc.close();
    }
}
