package anbu;
import java.util.Scanner;
public class revese {
    public static void main(StringEX[] args) {
        int n,rev=0,sum=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        n=sc.nextInt();
        int original=n;
        while (n!=0) {
            int digit=n%10;
            rev=rev*10+digit;
            
            
            n=n/10;
            


           
        }

        if(original==rev){
            System.out.println("poly");
        }
        else{
            System.out.println("not poly");
        }
    }
}
