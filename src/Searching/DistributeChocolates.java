public class DistributeChocolates {
    boolean isdivisionPossible(int[]arr, int n, int m, int mid){
        int studentCount = 1;
        int chocolateSum = 0;
        for(int i=0; i<n; i++){
            if(chocolateSum + arr[i] <= mid){
                chocolateSum += arr[i];
            } else {
                studentCount++;
                if(studentCount > m || arr[i] > mid){
                    return false;
                }
                chocolateSum = arr[i];
            }
        }
        return true;
    }
    static int distributeChocolates(int [] arr, int n){
       if(arr.length 
       <n) return -1;
       int ans =0,st=1, end=(int ) 1e9;
         while(st <= end){
          int mid = st + (end - st)/2;
          DistributeChocolates dc = new DistributeChocolates();
          if(dc.isdivisionPossible(arr, arr.length, n, mid)){
                ans = mid;
                end = mid -1;
          } else {
                st = mid +1;
          }
         }
         return ans;
    }

    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
    
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m= sc.nextInt();
        System.out.println();
        System.out.println(distributeChocolates(arr,m ));
        sc.close();
    }
    
}
