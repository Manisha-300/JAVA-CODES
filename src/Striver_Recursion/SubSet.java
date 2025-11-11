package Striver_Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSet {
     static void findSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
       
        result.add(new ArrayList<>(current));


        for (int i = index; i < nums.length; i++) {
            
            current.add(nums[i]);

            
            findSubsets(nums, i + 1, current, result);

            
            current.remove(current.size() - 1);
        }
    }


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int []nums=new int [n];
       for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
       }
     List<List<Integer>> subsets = subsets(nums);

        System.out.println("All subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    
        sc.close();
}
}
