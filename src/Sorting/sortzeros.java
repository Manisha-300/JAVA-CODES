import java.util.Scanner;

public class sortzeros {
     static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortArrayByParity(int []arr){
        int n=arr.length;
       int left=0,right=0;//left pointer for non zero elements and right pointer for traversing the array
        while(right<n){
            if(arr[right]!=0){//swap only when non zero element is found
                swap(arr, left, right);
                left++;
            }
            right ++;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
       
    }

    

     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortArrayByParity(arr);
        // rev(ans);
        // for(int i=0;i<n;i++){
        //     System.out.print(ans[i]+" ");
        // }
        sc.close();
}
}
    
