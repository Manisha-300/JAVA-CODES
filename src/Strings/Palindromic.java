package Strings;

import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb+"";
        if(str.equals(rev))
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
    
}
