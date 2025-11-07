import java.util.ArrayList;
import java.util.Scanner;

public class SSQ {
    static ArrayList<String> getSSQ(String s){

        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }
// base case
        char curr=s.charAt(0);
        ArrayList<String> small=getSSQ(s.substring(1));
         for(String ss: small){
            ans.add(ss);//bc
            ans.add(curr+ss);//abc
         }
          return ans ;
    }
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       ArrayList<String> ss=getSSQ(s);
      System.out.println(ss);
       sc.close();
    
    }
}
