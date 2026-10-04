import java.util.*;
class Details{
    int age,salary;
    String name;
    Details(){
     
    }
    void display(){
        System.out.println("NAME:"+name);
      System.out.println("AGE:"+age);
       System.out.println("SALARY:"+salary);
    }
  
}
public class inputcons {
    public static void main(String[] args) {
        Details d1=new Details();
        Scanner sc=new Scanner(System.in);
        System.out.println("Name:");
        d1.name=sc.next();
         System.out.println("AGE:");
        d1.age=sc.nextInt();
         System.out.println("SALARY:");
        d1.salary=sc.nextInt();
        Details d2=new Details();
        System.out.println();
        
      
        System.out.println("Name:");
        d2.name=sc.next();
         System.out.println("AGE:");
        d2.age=sc.nextInt();
         System.out.println("SALARY:");
        d2.salary=sc.nextInt();
        System.out.println();
         System.out.println("-----------------------------------------------------");
        d1.display();
        System.out.println("-----------------------------------------------------");
        d2.display();

    }
}
