
import java.util.Scanner;

public class PrintSSQ {
    static void print(String s, String curr ){

        if(s.length()==0){
         System.out.println(curr);  
         return ; 
        }
        char currans=s.charAt(0);

           String rem=s.substring(1);
           print(rem,currans+curr);//bc,a
        
           print(rem,curr);//exclude curr
           
    }
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
   //   String sn=sc.nextLine();
      print(s, "");
       sc.close();
    
    }
    
}
