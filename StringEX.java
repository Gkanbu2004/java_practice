package anbu;
import java.util.*;
public class StringEX {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        s=sc.next();
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str=str+s.charAt(i);
        }
        System.out.println(str);
    }
}
