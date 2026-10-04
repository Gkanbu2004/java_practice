interface payment{
    void pay();

}
class Upi implements payment{
public void pay(){
    System.out.println("upi payment successfully");
}
}
class Atm implements payment{
    public void pay(){
        System.out.println("Atm payment successfully");
    }
}
class cash implements payment{
    public void pay(){
        System.out.println("cash payment");
    }
}
public class interfacedemo {
    public static void main(String[] args) {
        Upi u=new Upi();
        u.pay();
        Atm a=new Atm();
        a.pay();
        cash c=new cash();
        c.pay();
    }
}
