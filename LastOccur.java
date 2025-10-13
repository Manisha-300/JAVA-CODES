import java.util.Scanner;

public class LastOccur {

    static int lasttooccur(int arr[],int x){
        int last=-1;
        for(int i=0;i<arr.length;i++)
{
    if(arr[i]==x){
        last=i;
    }
}
return last;
}
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
    }
    int x=sc.nextInt();
    System.out.println("last occurence of x is at index "+lasttooccur(arr, x));
    sc.close();

}
}