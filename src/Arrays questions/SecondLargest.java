import java.util.*;

public class SecondLargest {
    static int findmax(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
static int seclarge(int []arr){
    int max=findmax(arr);
    for(int i=0;i<arr.length;i++){
             if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
             }
    }
    int secmax=findmax(arr);
    return secmax;
}

    //int range 
    public static void main(String[] args) {
       // System.out.println(Integer.MIN_VALUE);// -2147483648
        //System.out.println(Integer.MAX_VALUE);//2147483647
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("second largest is "+seclarge(arr));
        sc.close();
    }
//  inputs   45
// 76
// 34
// 65
// 43
//output
//second largest is 65
}
