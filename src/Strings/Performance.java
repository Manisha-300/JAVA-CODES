package Strings;

import java.util.Scanner;

public class Performance {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String str="hello";
        String str2="hello";
        System.out.println(str==str2);// compares memory location returns true as both has same address
        System.out.println(str.equals(str2));// compares content returns true as both has same content4
        //equals() checks character by character
        sc.close();
    }
    
}
