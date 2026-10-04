package anbu;
import java.util.Scanner;
public class amstrong {
    public static void main(StringEX[] args) {
        int sum=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
        int original=n;
        while (n !=0) {
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        if (original==sum) {
            System.out.println("ams");
        }
        else{
            System.out.println("not amstrong");
        }
    }
}
