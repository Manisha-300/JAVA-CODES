package Strings;

import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
       Scanner
         sc=new Scanner(System.in);
         String str=sc.nextLine();
    int n= str.length();//length of string 
    System.out.println("length of string is "+n);
    char ch= str.charAt(0);//character at index 0
    System.out.println("character at index 0 is "+ch);
    sc.close();
    }
    
}
