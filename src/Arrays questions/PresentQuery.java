import java.util.Scanner;

public class PresentQuery {
    static int[] makefreqArray(int []arr){
        int [] freq= new int [100005];
           for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
           }
           return freq;
    }
    public static void main(String []agrs){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

       }
       int [] freq =makefreqArray(arr);
       System.out.println("enter the number of queries");
       int q=sc.nextInt();
       while (q>0){
       System.out.println("enter number to be searched");
       int x= sc.nextInt();
       if(freq[x]>0){
        System.out.println("yes");

       }else{
        System.out.println("no");
       }
       q--;
       }
sc.close();
    }
// input    Enter the array 5
// 34
// 12
// 34
// 12
// 56
// enter the number of queries
// 6
//output
// enter number to be searched
// 12
// yes
// enter number to be searched
// 34
// yes
// enter number to be searched
// 45
// no
// enter number to be searched
// 56
// yes
// enter number to be searched
// 3
// no
// enter number to be searched
// 4
// no
}
