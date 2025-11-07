
import java.util.Scanner;

public class KeypadComb {
    static void comb(String  dig,String []kp, String res){
          if(dig.length()==0){
            System.out.println(res+" ");
            return ;
          }
          int curr=dig.charAt(0)-'0';
          String curchoice=kp[curr];
          for(int i=0;i<curchoice.length();i++){
            comb(dig.substring(1),kp,res+curchoice.charAt(i));
          }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        //  int n=sc.nextInt();
      
        //  String s=sc.nextLine();
        String s="253";
     String [] key={"","","abc","ghi","mno","tuv","wxyz","jkl"};
     comb(s, key, "");
      
       sc.close();
    
    }
}
