import java.util.*;
class bankapp {
public static void main(String [] args){
    int n,pin=1234,balance=10000,acno=1234;
    int dp,wd,userpin;
    String name="Arulselvi";
    Scanner sc=new Scanner(System.in);
    String transaction[]=new String[10];
    int count=0;
  int press=1;
 
    while (true) {
        
         System.out.println("Enter pin:");
    userpin=sc.nextInt();
    
    if(userpin==pin){
        System.out.println("Login Successfull!");
        break;
    }
    else{
        System.out.println("your pin is wrong,please enter the correct pin:");
    } 
}

do{
        System.out.println("Enter your choice:");
        n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Balance Amount:"+balance);
                
                break;
            case 2:
                System.out.println("Enter the deposite amount:");
                dp=sc.nextInt();
                if(dp>0){
                balance+=dp;
                transaction [count]="Deposite:"+dp;
                count++;
                System.out.println("Amount Deposited successfully:");
                System.out.println("Current Balance:"+balance);}
                break;
            case 3:
                System.out.println("Enter the withdraw amount:");
                wd=sc.nextInt();
                if(  wd>0 && wd<=balance){
                balance-=wd;
                transaction[count]="withdraw"+wd;
                count++;
                 System.out.println("Amount Withdraw successfully:");
                System.out.println("Current Balance:"+balance);
                }else{
                    System.out.println("insufficient balance");
                }
                break;
            case 4:
                System.out.println("Enetr the original pin:");
                int original_pin=sc.nextInt();
                if(original_pin==pin){
                    System.out.println("Enetr the new pin:");
                int new_pin=sc.nextInt();
                pin=new_pin;
                System.out.println("your pin is changed");
                
                }
                break;
            case 5:
                 System.out.println("______________________________________________________");
                 System.out.println("\t\t\tBank Details");
                 System.out.println("______________________________________________________");
                 System.out.println("Account Number:"+acno);
                 System.out.println("Name:"+name);
                 System.out.println("Balance:"+balance);
                 break;
            case 6:
                if(count>0){
                System.out.println("------------Transaction history--------------");
                for(int i=0;i<count;i++){
                    System.out.println((i+1)+"."+ transaction[i]);
                }}
                else{
                    System.out.println("no transaction ");
                }
                break;
            case 7:
                System.out.println("Thank you!");
                System.out.println("please visite again");
                break;
            default:
                System.out.println("not valid");

        }
        

        
       
    } while (n!=7);
            
    } 

}

    
