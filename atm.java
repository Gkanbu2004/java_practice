package anbu;
import java.util.Scanner;
class atm {
    public static void main(StringEX[] args) {
        int balance=1000,choice,dep,wd;
        System.out.println("____________________________________________________");
        System.out.println("\t\t\t ATM MENU");
        System.out.println("____________________________________________________");
        System.out.println("1.Check Balance.");
        System.out.println("2.withdraw.");
        System.out.println("3.deposite.");
        System.out.println("4.Exite");
        System.out.println("_____________________________________________________");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Current balance:"+balance);
                break;
            case 2:
                System.out.println("Enter the wd amt:");
                wd=sc.nextInt();
                if(wd<=balance){
                    balance-=wd;
                    System.out.println("Current Balance Amount:"+balance);
                }
                else{
                    System.out.println("insufficient");
                }
                break;
            case 3:
                System.out.println("Enter the Dposite amt:");
                dep=sc.nextInt();
                balance+=dep;
                System.out.println("Current Balance Amount:"+balance);
                break;
            case 4:
                System.out.println("Thank you for using our Atm");
        
            default:
                System.out.println("invalid choice");
        }
    }
}
