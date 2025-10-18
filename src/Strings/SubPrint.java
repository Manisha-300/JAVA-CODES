package Strings;

import java.util.Scanner;

public class SubPrint {
    static void printsub(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j>=i;j++){
                System.out.println(str.substring(i,j)+" ");
            }
          
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();//next() will take input  for single word input  and nextLine() will take input for whole line 
        printsub(s);// user input 

        String str="abc";//hardcoded input
        printsub(str);

        //interning and new 
        String s1=new String ("hello");
        String s2="hello";
        System.out.println(s1==s2);//false
        String s3=s1.intern();// it will return string from pool if present else add this string to pool and return its reference
        System.out.println(s2==s3);//true
        // interning is done to save memory
      //new in string is used to create different objects in heap memory even if the content is same
      // strings are immutable
      // s.charAt(0)='H'; // not allowed
      String s4="hello";
      s4=s4.substring(0,2)+'y'+s4.substring(3);// new string is created in heap and s will refer to that new string
      System.out.println(s4);//heyllo
      //"he"+ "y"+"llo" -> "heyllo"
      //it does not changes the exact strings
      // imutability of strings is because of interning and also string pool 
      

      sc.close();
    }
    
}
