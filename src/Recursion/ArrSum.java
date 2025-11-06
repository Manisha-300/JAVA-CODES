import java.util.Scanner;

public class ArrSum {

    static int sum(int []arr,int idx){
        if(idx==arr.length) return 0;
        int small=sum(arr,idx+1);
        return small+arr[idx];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // int i=sc.nextInt();
     System.out.println(sum(arr, 0));
       sc.close();
    }
}
