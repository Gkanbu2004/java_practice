interface Bill{
    void billmethod();
}
abstract class paticent{
    private String name;
    private int roomcharge,medicine;
    abstract void pay();
    paticent(String name,int roomcharge,int medicine) {
        this.name=name;
        this.roomcharge=roomcharge;
        this.medicine=medicine;
    }
    public String getName(){
        return name;
    }
    public int getRoomcharge(){
        return roomcharge;
    }
    public int getMedicine(){
        return medicine;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roomcharge:"+roomcharge);
        System.out.println("medicine:"+medicine);
    }
}
class inpaidicient extends paticent implements Bill{
    inpaidicient(String name,int roomcharge,int medicine){
        super(name,roomcharge,medicine);
    }
    public void billmethod(){
        int b=getRoomcharge()+getMedicine();
        System.out.println("total bill:"+b);
    }
    void pay(){
        System.out.println("payment successfully");
    }
}
public class hospitalmangement {
    public static void main(String[] args) {
        inpaidicient i=new inpaidicient("anbu",20000,3000);
        i.display();
        i.billmethod();
        i.pay();
    }
}
