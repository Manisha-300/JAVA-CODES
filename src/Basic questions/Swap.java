import java.util.Scanner;

public class Swap {
    static void swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void secondapproach(int a,int b){
        a=a+b;
        a=a-b;
        b=a-b;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers to be swapped");
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a, b);
        System.out.println("after swapping the numbers are "+a+" "+b);
        //second approach without using temp variable 
        //secondapproach(a, b);
        sc.close();
    }
    
}
