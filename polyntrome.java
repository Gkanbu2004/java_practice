package anbu;
import java.util.*;
public class polyntrome {
   
    public static void main(String[] args) {
        String s,str="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        s=sc.next();
        for(int i=s.length()-1;i>=0;i--){
            str=str+s.charAt(i);
        }
        if(s.equals(str)){
            System.out.println("polyntrome");
        }
        else{
            System.out.println("not polyntrome");
        }
    }
}

