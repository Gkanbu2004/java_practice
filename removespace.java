package anbu;
import java.util.*;
public class removespace {
    public static void main(String[] args) {
        String s1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the string:");
        s1=sc.nextLine();
        char ch;
        String s2=" ";
        for(int i=0;i<s1.length();i++){
           ch=s1.charAt(i);
            if(ch!=' '){
                 System.out.print(ch);
              
            }
              
        }
       
    }
}
