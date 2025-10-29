package Strings;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
     //hello-> mello
        sb.setCharAt(0, 'm');
        System.out.println(sb);
           // will append true as string
        sb.append(true);
        System.out.println(sb);
        /// will append world 
        sb.append("world");
        System.out.println(sb);
        //will insert a at index at 0
        sb.insert(0, 'a');
        System.out.println(sb);
        //it deletes  single starting character at index 3
        sb.deleteCharAt(3);


        System.out.println(sb);
        // it deletes character from index 1 to 3 but 3 is not included
        sb.delete(1, 3);
        System.out.println(sb);

        sb.reverse();
        //will reverse the string
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        

    }
    
}
