package anbu;
import java.util.*;
public class countvowels {
    public static void main(String[] args) {
        String str;
        int v=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        str=sc.next();
        char str1;
        for(int i=0;i<str.length();i++){
            str1=str.charAt(i);
             if(str1=='a' || str1=='e' || str1=='i' || str1=='o' || str1=='u' || str1=='A' || str1=='E' || str1=='I' || str1=='O' || str1=='U'){
                v++;

             }
             else{
            c++;
        }
        }
        System.out.println(v);
        System.out.println(c);
        
       
    }
}
