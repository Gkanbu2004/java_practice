package anbu;
import java.util.Scanner;
class largethree {
    public static void main(StringEX[] args) {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three value:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println("num1 is greater");
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("num2 is greater");
        }
        else if(num3>=num1 && num3>=num2){
            System.out.println("num3 is grreater");
        }
        else{
            System.out.println("num1,num2,num3 are equals");
        }
    }
}
