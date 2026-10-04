import java.util.*;
abstract class product{
    int id,price,quantity,n;
    String name;
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Price:"+price);
        System.out.println("Quantity:"+quantity);
    }
    abstract void discount();
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getprice(){
        return price;
    }
    public int getquantity(){
        return quantity;
    }
    public void setprice(int price){
        this.price=price;
    }
}
interface payment{
    void pay();
}
class shopping extends product implements payment{

    void addproduct(){
        
    }
    void  discount(){

    }
    public void pay(){

    }
}
public class onlineshopping {
    public static void main(String[] args) {
        static product products[] = new product[5];
static int count = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        int price = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        System.out.println("===== ONLINE SHOPPING =====\n" + //
                        "\n" + //
                        "1. Add Product\n" + //
                        "2. Display Products\n" + //
                        "3. Search Product\n" + //
                        "4. Buy Product\n" + //
                        "5. Calculate Discount\n" + //
                        "6. Update Quantity\n" + //
                        "7. Payment\n" + //
                        "8. Exit");
                        System.out.println("Enter your choice:");
                        product p1=new laptop(id,name, price, quantity);
                        products[count]=p1;
                        count++;
                        System.out.println("Product Added Successfully");
    
                        

                  
    }
    
}
