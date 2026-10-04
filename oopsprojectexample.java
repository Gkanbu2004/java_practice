interface payment{
    void pay();
}
abstract class Food {
  private String foodname;
  private int price,orderid; 

  abstract void dicount();
  Food(int price,String foodname,int orderid){
    this.price=price;
    this.foodname=foodname;
    this.orderid=orderid;
  }
  public int getorderId(){
    return orderid;
  }
  public int getPrice(){
    return price;
  }
  public String getFoodname(){
    return foodname;
  }
  void display(){
    System.out.println("ID:"+orderid);
    System.out.println("FOODNAME:"+foodname);
    System.out.println("PRICE:"+price);
  }
}
  class pizza extends Food implements payment{
     pizza(int price,String foodname,int orderid){
        super(price,foodname,orderid);
    }
    
    void dicount(){
        double discount=getPrice()*(20/100.0);
        System.out.println("discount amount:"+discount);
        System.out.println("Total price:"+(getPrice()-discount));
    }
   public void pay(){
        System.out.println("Payment successfully");
    }


  }
  class dosa extends Food implements payment{
        dosa(int price,String foodname,int orderid){
            super(price, foodname, orderid);
        }
        void dicount(){
            double discount=getPrice()*(10/100.0);
        System.out.println("discount amount:"+discount);
        System.out.println("Total price:"+(getPrice()-discount));
        }
         public void pay(){
        System.out.println("Payment successfully");
    }
    }
  


public class oopsprojectexample {
    public static void main(String[] args) {
        pizza p1=new pizza(1000,"anbu",1);
        p1.display();
        p1.dicount();
        p1.pay();
        dosa s1=new dosa(2000,"dosa",2);
        s1.display();
        s1.dicount();
        s1.pay();
    }
}
