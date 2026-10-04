class Company{
    int id,salary;
    String name;
    Company(){
        id=1;
        name="arul";
        salary=20000;
        System.out.println("Default constructor:");
    }
    Company(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        System.out.println("Parameterized constructor");
    }
    Company(int id,int salary){
        this.id=id;
        name="selvi";
        this.salary=salary;
        System.out.println("overloading constuctor");
    }
    void display(){
        System.out.println("----------------------------------------");
        System.out.println("ID:"+id);
        System.out.println("NAME:"+name);
        System.out.println("SALARY:"+salary);
    }
}
public class constructorproject {
    public static void main(String[] args) {
        Company c1=new Company();
         Company c2=new Company(2,"arulselvi",30000);
         Company c3=new Company(3,40000);
         c1.display();
         c2.display();
         c3.display();
    }
}
