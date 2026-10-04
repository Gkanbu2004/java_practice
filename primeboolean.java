package anbu;
import java.util.*;
public class primeboolean {
    public static void main(StringEX[] args) {
        int n,i=2;
        boolean prime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        n=sc.nextInt();
        
            if(i<=n){
                for(i=2;i<n;i++){
                if(n%i==0){
                    prime=false;
                }
                else if(n<2){
                    prime=false;
                }
                
                }
            }
        if(prime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime number");
        }
        
    }
}
