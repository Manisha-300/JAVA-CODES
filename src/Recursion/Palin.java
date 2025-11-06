import java.util.Scanner;

public class Palin {
    static String rev(String s ,int idx){
        if(idx==s.length()) return "";
        String small=rev(s,idx+1);
        return small+s.charAt(idx);

    }
    static boolean ispalin(String s,int l,int r){
        if(l>=r) return true;
        return (s.charAt(l)== s.charAt(r) && ispalin(s,l+1,r-1));
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
    System.out.println(rev(s, 0));
    String reverse=rev(s,0);
    int n=s.length();
    if(reverse.equals(s))
    {
        System.out.println("palin");
    }
    else{
        System.out.println("not palin");
    }
    System.out.println(ispalin(reverse, 0, n-1));
      sc.close();
    }
    
}
