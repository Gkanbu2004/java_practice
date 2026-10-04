package anbu;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("String1");
        s1=sc.next();
        System.out.println("String2");
        s2=sc.next();
        if(s1.length()!=s2.length()){
            System.out.println("Not anagram");
        }
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}
