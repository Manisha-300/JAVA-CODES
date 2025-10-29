import java.util.Scanner;

public class SortSquares {
    static void rev(int []arr){

        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    
    static int[] sortedsquares(int []arr){
        int n=arr.length;
        int left=0,right=n-1;
        int [] res=new int [n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                res[k++]=arr[left]*arr[left];
                left++;
            }
            else{
                res[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []ans=sortedsquares(arr);
        rev(ans);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
    
}
