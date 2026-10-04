package anbu;
import java.util.Scanner;
public class sumdo {
    public static void main(StringEX[] args) {
        int n,digit,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        n=sc.nextInt();
        do{
           
            digit=n%10;
            rev++;
            n=n/10;
        }while(n!=0);
         System.out.println(rev);

        }
    }

