import java.util.Scanner;

public class RotateWithoutspaces {
    static void rev(int []arr,int i, int j){
        
        while(i<j){
            int temp=i;
            i=j;
            j=temp;

        }
    }
    static void rotateInPlace(int [] arr , int k){
        int n=arr.length;
        k=k%n;
        rev(arr,0,n-k-1);
         rev(arr,n-k,n-1);
         rev(arr,0,n-1);
        
    }
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        rotateInPlace(arr,k);
        System.out.println("After rotation");
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
    
}
