import java.util.Scanner;

public class StringsRecursive {
    static String removeA(String a,int idx){
        if(idx ==a.length()) return "";
        String small=removeA(a,idx+1);
        char curr=a.charAt(idx);
        if(curr!='a'){
            return curr+small;
        }
           else{
            return small;
           }
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       System.out.println(removeA(s, 0));
       sc.close();
    }
}
