import java.util.*;
interface transaction{
    void deposite(int amount);
    void withdraw(int amount);
}
abstract class BankAccount{
    private int accountNo;
    private String name;
    private int balance;
    abstract void accountype();
    BankAccount(){
        System.out.println("Account Created:");

    }
    BankAccount(int accountNo,String name,int balance){
        this.accountNo=accountNo;
        this.name=name;
        this.balance=balance;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    void display(){
    System.out.println("-------------------------");
    System.out.println("NAME:"+name);
    System.out.println("ACCOUNT NAME:"+accountNo);
    System.out.println("BALANCE:"+balance);
}
}
class SavingAccount extends BankAccount implements transaction{
   SavingAccount(){
    super();
   } 
   SavingAccount(int accountNo,String name,int balance ){
    super(accountNo,name,balance);
   }
   void accountype(){
    System.out.println("Account type:Saving account");
   }
   public void deposite(int amount){
    setBalance(getBalance()+amount);
    System.out.println("Deposite:"+amount);
   }
   public void withdraw(int amount){
    if(getBalance()>=amount){
        setBalance(getBalance()-amount);
        System.out.println("Wd amount:"+amount);
    }
    else{
        System.out.println("insufficient amount");
    }
   }
}
public class oopsproject {
public static void main(String[] args) {
   SavingAccount s1=new SavingAccount(10,"anbu",20000);
   s1.accountype();
   s1.display();
   s1.deposite(1000);
   s1.withdraw(2000);
   System.out.println("------------------------------------");
   System.out.println("Balance:"+s1.getBalance());
    
}
    
}