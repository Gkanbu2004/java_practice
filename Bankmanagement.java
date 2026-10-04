interface bankmethod{
    void deposit(int amt);
    void deposit(int amt,String msg);
    void withdraw(int amt);
    void change(int newpin,String msg);
}
abstract class bankcustomer{
    private String name;
    private int acno,balance,pin;
    abstract void accounttype();
    bankcustomer(String name,int acno,int balance,int pin){
        this.name=name;
        this.acno=acno;
        this.balance=balance;
        this.pin=pin;

    }
    public String getName(){
        return name;
    }
    public int getAcno(){
        return acno;

    }
    public int getBalance(){
        return balance;
    }
    public int getPin(){
        return pin;
    }
    public void setBalance(int amt){
        balance=amt;
    }
    public void setPin(int newpin){
        pin=newpin;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Accountno:"+acno);
        System.out.println("balance:"+balance);
        System.out.println("pin:"+pin);
    }
}
class bankdetails extends bankcustomer implements bankmethod{
    bankdetails(String name,int acno,int balance,int pin){
        super(name, acno, balance, pin);
    }
    void accounttype(){
        System.out.println("Account type:saving account");
    }
   public void withdraw(int amt){
      if(getBalance()>=amt){
        setBalance(getBalance()-amt);

            System.out.println("Wd Amount: "+amt);
            System.out.println("Balance: "+getBalance());
      }

    }
    public void deposit(int amt){
        setBalance(getBalance()+amt);
        System.out.println("deposite: "+amt);
        System.out.println("Balance: "+getBalance());

    }
    public void change(int newpin,String msg){
        setPin(newpin);
        System.out.println(msg);
        System.out.println("newpin:"+getPin());
     
    }
    public void deposit(int amt,String msg){
        setBalance(getBalance()+amt);
        System.out.println("deposite:"+amt);
        System.out.println(msg);
        System.out.println("Balance: "+getBalance());
        
       
    }
}
public class Bankmanagement {
    public static void main(String[] args) {
        bankdetails b1=new bankdetails("anbu",1,20000,1234);
        b1.display();
        System.out.println("-------------------------------");
        System.out.println();
        b1.accounttype();
        System.out.println();
        b1.deposit(100);
        System.out.println();
        b1.withdraw(1000);
        System.out.println();
        b1.change(4321,"pin chaged sucessfully");
        System.out.println();
        b1.deposit(3000, "Case Deposite");
    }
}
