package ArrayList;
import java.util.*;
public class WrapperClass {
            public static void main(String[] args) {
        
        Integer j= Integer.valueOf(10);
        System.out.println(j);
        Float f= Float.valueOf(5.5f);
        System.out.println(f);
        Double d= Double.valueOf(4.5);
        System.out.println(d);
            ArrayList<Integer> list= new ArrayList<>();
            list.add(j);
            //printing using get method
            System.out.println(list.get(0));
             
             for(int i =0;i<list.size();i++){
                System.out.println(list.get(i));
             }

                //adding elements at some index 1
                list.add(1,15);
                System.out.println(list);


               //modifying value at index 0
               list.set(0,20);
                System.out.println(list);
                //removing element at index 1
                list.remove(1);
                System.out.println(list);

                list.remove(Integer.valueOf(0));
                System.out.println(list);
           //checking if list contains some value
           boolean contains=list.contains(Integer.valueOf(0));
              System.out.println(contains);

            


        }
    
}
