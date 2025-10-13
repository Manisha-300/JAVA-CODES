import java.util.Arrays;
import java.util.Scanner;
public class Bonus {
    static int [] smallestofarray(int []arr)
    {//first we are sorting the array with the help of sort function of Arrays class
       Arrays.sort(arr);
      int []ans= {arr[0],arr[arr.length-1]};
return ans;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        // Bonus obj=new Bonus();
        // obj.smallestofarray(arr);
        System.out.println("smallest and largest of array is "+Arrays.toString(smallestofarray(arr)));
        sc.close();
    }
}
