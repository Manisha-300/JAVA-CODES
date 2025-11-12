public class SortingStrings {
    static void sortString(String []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int j=i;
            for(int k=i+1;k<n;k++){
                if(arr[k].compareTo(arr[j])<0){
                    j=k;
                }
            }
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        
        }

    }
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        sortString(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
