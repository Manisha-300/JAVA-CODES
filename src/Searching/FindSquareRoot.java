package Searching;
public class FindSquareRoot {

     static int sqrt(int x){
        int st = 0, end = x;
        int ans = -1;
        while (st <=end){
            int mid = st + (end-st)/2;
            int val = mid * mid; // use long here to avoid overflow
            if(val == x){
                return mid;
            } else if(val < x){
                ans = mid;
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(sqrt(x));
        sc.close();
    }
}
