package anbu;
import java.util.*;
public class cwords {
   public static void main(String[] args) {
    String s;
    int w=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Strings:");
    s=sc.nextLine();
    
    char s1;
    for(int i=0;i<s.length();i++)
    {
        s1=s.charAt(i);
        if(s1==' '){
            w++;
        }
    }
    System.out.println(w);
   } 
}
