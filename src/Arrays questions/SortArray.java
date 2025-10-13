import java.util.*;
public class SortArray {


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
    static void sortzeros(int []arr){
        int n=arr.length;
        int z=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
             //   swap(arr,i,z);
                z++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<z){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    static void secondapproach(int []arr){//two pointer approach
   int n=arr.length;
    int left=0,right=n-1;
    while(left<right){
        if(arr[left]==1 && arr[right]==0){//condition to swap
            swap(arr,left,right);// WE SWAP THE ELEMENTS
            left++;
            right--;
        }
        if(arr[left]==0){// IF left is 0 we move forward
            left++;
        }
        if(arr[right]==1){// IF right is 1 we move backward
            right--;
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
          //  sortzeros(arr);
            secondapproach(arr);
            System.out.println(" sorted array ");
            printarray(arr);
      sc.close();
    }
//     5
// enter the elements of array
// 0
// 1
// 1
// 0

// 0
// 0 1 1 0 0  sorted array 
// 0 0 0 1 1 
    
}
