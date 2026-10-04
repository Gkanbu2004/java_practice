package anbu;
import java.util.*;
public class doprime {
    public static void main(StringEX[] args) {
        int n,i=2,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        n=sc.nextInt();
        do{
            if(n%i==0){
                count++;
                break;
            }
             i++;
        }while(i<n);
           

        if(count==0){
            System.out.println("prime");
        }
        else if(n<=1){
            System.out.println("not prime");
        }
        else{
            System.out.println("not prime");
        }
        sc.close();

    }
}
