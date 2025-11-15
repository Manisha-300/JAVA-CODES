public class FindPeakIndex {
    static int peakIndex(int[] a){
        int n = a.length;
        int st = 0, end = n-1;
        while(st < end){
            int mid = st + (end-st)/2;
            if(a[mid] > a[mid+1]){
                end = mid;
            } else {
                st = mid+1;
            }
        }
        return st;
    }
    public static void main(String[] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(peakIndex(arr));
        sc.close();
    }
    
}
