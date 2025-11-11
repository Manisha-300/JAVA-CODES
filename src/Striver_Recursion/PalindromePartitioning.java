package Striver_Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartitioning {
     static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

   
    static void helper(String s, List<String> current, List<List<String>> result) {
        // Base case
        if (s.isEmpty()) {
            result.add(new ArrayList<>(current));
            return;
        }

       
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (isPalindrome(prefix)) {
                current.add(prefix);              
                helper(s.substring(i), current, result); 
                current.remove(current.size() - 1);
            }
        }
    }
     public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(s, new ArrayList<>(), result);
        return result;
     }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        List<List<String>> ans = partition(s);

        System.out.println("Palindrome partitions of \"" + s + "\":");
        for (List<String> list : ans) {
            System.out.println(list);
        }
        sc.close();
    }
}
