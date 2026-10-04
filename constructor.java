class company{
    int id,salary;
    String name;
    company(){
        id=1;
        salary=2000;
        name="selvi";
    }
    void demo(){
        System.out.println("ID:"+id);
        System.out.println("NAME:"+name);
        System.out.println("SALARY"+salary);
    }
}
public class constructor {
  public static void main(String[] args) {
    company c1=new company();
    c1.demo();
    company c2=new company();
    c2.demo();
  }  
}
