package anbu;
import java.util.*;
public class compare {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1; ");
        s1=sc.nextLine();
        System.out.println("Enter the string2; ");
        s2=sc.nextLine();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
