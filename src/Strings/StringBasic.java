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
   //indexof function
    int index= str.indexOf("a");
    System.out.println("index of a is "+index);

//compareTo function
    String str2="apple";
    int res=str.compareTo(str2);// returns 0 if both are equal , +ve if first string is greater and -ve if first string is smaller
    if(res==0){
        System.out.println("strings are equal");
    }

    else if(res>0){
        System.out.println("first string is greater than second string");
    }
    else{
        System.out.println("first string is smaller than second string");
    }
    // lexicographical means a string b string and wen we compare we compare based on ascii values of characters
// if some character ascii value is greater than other character then the string containing that character is greater
   

     System.out.println(str.contains("a"));
   
     System.out.println(str.endsWith("e"));//endswith checks whether string ends with given character or not
   
    System.out.println(str.toLowerCase());//converts string to lowercase
    
    System.out.println(str.toUpperCase());//converts string to uppercase
   
    System.out.println(str.concat(" ipad"));//concatenation of strings
    
    str.concat(str2);// strings are immutable so this will not change str value
   
    System.out.println(str);// original str will be printed
   
   
   
    // string + int/char/string will result in concatenation
   System.out.println(str+5);
    System.out.println(str+'c'); 
  
  
  
   // substring(i,j) and substring(i), i =begin and j=end 
   System.out.println(str.substring(1,3));
    System.out.println(str.substring(2));
   str+= " banana";// this will change str value
    System.out.println(str);

    

sc.close();
    }
    
}
