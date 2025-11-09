import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubSet2 {
     static void findSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
      
        result.add(new ArrayList<>(current));

        
        for (int i = index; i < nums.length; i++) {
           
            if (i > index && nums[i] == nums[i - 1])
                continue;

           
            current.add(nums[i]);

           
            findSubsets(nums, i + 1, current, result);

            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
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
    List<List<Integer>> subsets = subsetsWithDup(nums);

        System.out.println("Unique subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
        sc.close();
}
    
}
