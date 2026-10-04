package anbu;
import java.util.Scanner;
 class largest {
    public static void main(StringEX[] args) {
        int num1,num2,num3,small,second_small;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three value:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        if(num1<=num2 && num1<=num3){
            small=num1;
            second_small=(num2<=num3) ? num2:num3;
          }
          else if(num2<=num1 && num2<=num3){
            small=num2;
            second_small=(num1<=num3) ? num1:num3;
          }
          else{
            small=num3;
            second_small=(num1<=num2) ? num1:num2;
          }
          System.out.println("first smallest number is"+small);
          System.out.println("Second smallest number is:"+second_small);
        }
    }

