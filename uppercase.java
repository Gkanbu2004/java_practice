package anbu;
import java.util.*;
public class uppercase {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        str=sc.next();
        int upper=0,lower=0,sp=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='B'){
                upper++;
            }
            else if(ch>='a'&&ch<='z'){
                lower++;
            }
            else if(ch!=' '){
                sp++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(sp);
    }
}