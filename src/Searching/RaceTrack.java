public class RaceTrack {
    static boolean isPossible(int []a ,int k, int mid){
        int kd=1;
        int last=a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]-last >= mid){
                kd++;
                last = a[i];
               
            }

        }
        return kd >= k;
    }

    static int racetrack(int []a ,int k){
        if(k>a.length) return -1;
        int st=0, end =(int )   1e9;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(isPossible(a, k, mid)){
                ans = mid;
                st = mid+ 1;
            } else {
                end = mid -1;
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
        int k= sc.nextInt();
      
        System.out.println(racetrack(arr,k ));
        sc.close();
    }

    
}

