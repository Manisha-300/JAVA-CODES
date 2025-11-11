package Striver_Recursion;
import java.util.Scanner;

public class PrintStringPermut {
    static void printPermutations(String str, String ans) {
        // Base case
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String rest = str.substring(0, i) + str.substring(i + 1);

         
            printPermutations(rest, ans + ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printPermutations(s, "");
        sc.close();
    }
    
}
