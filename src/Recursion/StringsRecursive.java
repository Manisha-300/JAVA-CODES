import java.util.Scanner;

public class StringsRecursive {
     static String removeA2(String a){
        if(a.length()==0) return "";
        String small=removeA2(a.substring(1));
        char curr=a.charAt(0);
        if(curr!='a'){
            return curr+small;
        }
           else{
            return small;
           }
    }

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
       System.out.println(removeA2(s));
       sc.close();
    }
}
