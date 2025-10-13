import java.util.Scanner;
public class Search {
    void searchinarray(int arr[], int key){
        //linear search 
        int n=arr.length;
        int x=20;
        int ans=-1;


        for(int i=1;i<=n;i++){
            if(arr[i]==x || arr[i]==key){
                ans=i;
                break;
            }
        }
        System.out.println("element found at index "+ans);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        Search obj=new Search();
        obj.searchinarray(arr,key);
        sc.close();
    }
    
}
