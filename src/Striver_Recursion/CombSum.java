package Striver_Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombSum {
     public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        makeCombination(candidates, target, 0, new ArrayList<>(), 0, res);
        return res;        
    }

    private static void makeCombination(int[] candidates, int target, int idx, List<Integer> comb, int total, List<List<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(comb));
            return;
        }

        if (total > target || idx >= candidates.length) {
            return;
        }

        comb.add(candidates[idx]);
        makeCombination(candidates, target, idx, comb, total + candidates[idx], res);
        comb.remove(comb.size() - 1);
        makeCombination(candidates, target, idx + 1, comb, total, res);
    }    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] candidates=new int [n];
       for(int i=0;i<n;i++){
    candidates[i]=sc.nextInt();


       }
       int target=sc.nextInt();
        List<List<Integer>> ans = combinationSum(candidates, target);

        System.out.println(  target);
        for (List<Integer> combination : ans) {
            System.out.println(combination);
        }
        sc.close();
}
}
