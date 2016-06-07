import java.util.*;
import java.io.*; 
class EvenOdd
{
   public static String str(String s) {
    String even = "";
    String odd = "";
    int length = s.length();

    for (int i = 0; i <= length-2; i+=2) {          
        even += s.charAt(i+1) + "" + s.charAt(i);
    }

    if (length % 2 != 0) {          
        odd = even + s.charAt(length-1);
        return odd;
    } else {
        return even;
    }
}
public static void main(String[] args)
{
even in= new even();
System.out.println(in.str("computer"));
}
}
