package anbu;
import java.util.Scanner;
class fibonaaci {
    public static void main(StringEX[] args) {
        int first=0,second=1,fib,n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(first+" ");
          
            temp=first+second;
             first=second;
          second=temp;
         
            
        }
        
    }
}
