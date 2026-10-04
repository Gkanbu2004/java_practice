class Bank{
    private int acno;
    private int balance,pin;
    private String name;
    int dep,wd;
    public void setAcno(int acno)
    {
        this.acno=acno;
    }
    public int getAcno(){
        return acno;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPin(int pin){
        this.pin=pin;
    }
    public int getPi(){
        return pin;
    }
    public void deposite(int dep){
        balance+=dep;
       
    }
    public void withdraw(int wd){
        if(balance>wd){
            balance-=wd;
        }else{
            System.out.println("insufficient balance");
        }
    }

}
public class atmencapsul {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.setAcno(10);
        b1.setBalance(100000);
        b1.setName("Arulselvi");
        b1.setPin(123456);
        b1.deposite(2000);
        b1.withdraw(50000);
        System.out.println("Acno:"+b1.getAcno());
        System.out.println("Name:"+b1.getName());
        System.out.println("pin:"+b1.getPi());
        System.out.println("Balance:"+b1.getBalance());
    }
}
