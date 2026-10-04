package anbu;
import java.util.Scanner;;
public class prime {
    public static void main(StringEX[] args) {
        int n,count=0,i=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        n=sc.nextInt();
        while (i<n) {
            if(n % i==0){
                count++;
                break;
            }
            i++;
        }
        if(n<=1){
            System.out.println("not prime");

        }
        else if(count==0){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime");
        }
        sc.close();
    }
    
}
