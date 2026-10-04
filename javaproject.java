abstract class BankAccount {
  abstract void interest();
    
}
class SavingsAccount extends BankAccount{
   public void interest(){
        System.out.println("4%");
    }
}
class CurrentAccount extends BankAccount{
   public void interest(){
        System.out.println("14%");
    }
}
public class javaproject {
    public static void main(String[] args) {
        SavingsAccount b1=new SavingsAccount();
        b1.interest();
        CurrentAccount c1=new CurrentAccount();
        c1.interest();
    }
}
