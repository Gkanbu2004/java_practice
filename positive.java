package anbu;
import java.util.Scanner;
 class positive {

    public static void main(StringEX[] args) {
        int num,res;
        System.out.println("Enter the value:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num>0){
            System.out.println("positive value");
        }
        else if(num<0){
            System.out.println("negative value");
        }
        else{
            System.out.println("zero");
        }
        
        }
    }

