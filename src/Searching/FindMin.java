public class FindMin {
     static int findMinimum(int[] a){
        int n = a.length;
        int st = 0, end = n-1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] <= a[n-1]){
                ans = mid;
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMinimum(arr));
        sc.close();
    }

    
}
