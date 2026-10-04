import anbu.prime;

interface payment{
  void discount();
}
abstract class product {
   private String productname;
   private int price,id;
   abstract void pay();
   product( String productname,int price,int id){
    this.productname=productname;
    this.price=price;
    this.id=id;
   }
   public String getProductName(){
        return productname;
    }
    public int getPrice(){
        return price;
    }
    public int getId(){
        return id;
    }
    void display(){
        System.out.println("PrNAME:"+productname);
        System.out.println("PRICE:"+price);
        System.out.println("ID:"+id);
    }
}
class laptop extends product implements payment{
  laptop(String productname,int price,int id){
    super(productname,price,id);
  }
  
   public void dicount(){
    double discoun=getPrice()*(30/100.0);
    System.out.println("discount amt:"+discoun);
    System.out.println("total price:"+(getPrice()-discoun));
  }
  void pay(){
    System.out.println("payment successfuuly");
  }
}
class mobile extends product implements payment{
  mobile(String productname,int price,int id){
    super(productname,price,id);
  }
  
   public void dicount(){
    double discoun=getPrice()*(20/100.0);
    System.out.println("discount amt:"+discoun);
    System.out.println("total price:"+(getPrice()-discoun));
  }
  void pay(){
    System.out.println("payment successfuuly");
  }
}

public class shopping {
    public static void main(String[] args) {
        laptop l1=new laptop("phone",10000,1);
        l1.display();
        l1.dicount();
        l1.pay();
        System.out.println();
        mobile m1=new mobile("laptop",20000,2);
        m1.display();
        m1.dicount();
        m1.pay();
    }
}
