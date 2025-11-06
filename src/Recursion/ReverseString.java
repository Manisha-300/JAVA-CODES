import java.util.Scanner;

public class ReverseString {
    
    static String rev(String s ,int idx){
        if(idx==s.length()) return "";
        String small=rev(s,idx+1);
        return small+s.charAt(idx);

    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
    System.out.println(rev(s, 0));
       sc.close();
    }
    
}
