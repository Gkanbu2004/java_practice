package anbu;
import java.util.Scanner;
class forex {
    public static void main(StringEX[] args) {
        int mul=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            mul=mul*i;
           
        }
        System.out.println(mul);
    }
}
