import java.util.Scanner;

public class RepeatingNumber {
    static int firstrepeat(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){//first number is here 
                if(arr[i]==arr[j]){//second number is here  
                    return arr[i];// answer is found here
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array");
       int n=sc.nextInt();
       System.out.println("enter the elements of array");
        int arr[]=new int[n];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
         


        System.out.println(firstrepeat(arr));
        sc.close();

    }
}

