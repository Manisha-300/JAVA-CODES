import java.util.Scanner;

public class ReverseArr {
    static void rev(int [] arr,int i,int j ){
        if(i>=j) return ;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        rev(arr,i+1,j-1);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // int i=sc.nextInt();
  rev(arr, 0, n-1);
  for(int num: arr){
    System.out.println(num+" ");
  }
       sc.close();
    }
    
    
}
