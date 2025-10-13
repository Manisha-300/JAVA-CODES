import java.util.*;
public class Sortevenandodd {
    static int [] printarray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortArrayByParity(int []arr){
        int n=arr.length;
       int left=0,right=n-1;
         while(left<right){
              if(arr[left]%2==1 && arr[right]%2==0){//condition to swap
                swap(arr,left,right);// WE SWAP THE ELEMENTS
                left++;
                right--;
    
                if (arr[left]%2==0){// IF left is even we move forward
                    left++;
                }
                if(arr[right]%2==1){// IF right is odd we move backward
                    right--;
                }
         }

    }
    }
        public static void main (String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter the elements of array");
         for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
         }
         printarray(arr);
          sortArrayByParity(arr);
          System.out.println("sorted even and odd array is ");

          printarray(arr);
          sc.close();
    }
    

}
