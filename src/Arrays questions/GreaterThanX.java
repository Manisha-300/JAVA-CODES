import java.util.Scanner;

public class GreaterThanX {
    static boolean issorted(int []arr){
        boolean see= true;
        for(int i=1;i<arr.length;i++){
             if(arr[i] <arr[i-1]){
                //notsort
                see=false;
                break;
             }
        }
return see;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(issorted(arr));
        sc.close();
    }
}
