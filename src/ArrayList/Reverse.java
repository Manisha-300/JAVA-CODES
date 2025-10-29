package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class Reverse {
    static void reverseList(ArrayList<Integer> list){
      int i=0,j=list.size()-1;
      while(i<j){
        /*
        int temp=a
        a=b
        b=temp
        */ 
        int temp=Integer.valueOf(list.get(i));
        list.set(i, list.get(j));
        list.set(j, temp);
        i++;
        j--;
    }
    }
    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(0);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        System.out.println("Original list: "+li);
        reverseList(li);
        System.out.println("Reversed list: "+li);
        //or we can use Collections class
        Collections.reverse(li);
        System.out.println("Reversed again using Collections.reverse(): "+li);
        Collections.sort(li);//collections class ka sort method use krke sort kr skte h
        System.out.println("Sorted list using Collections.sort(): "+li);
        

      // if u dont specify the data type of ArrayList , it will be treated as Object type
    }


    
}
