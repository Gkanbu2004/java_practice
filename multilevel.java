package anbu;
class company{
    String cname="TCS";
    String loc="Chennai";
    void cde(){
        System.out.println("Company Name:"+cname);
        System.out.println("Location:"+loc);
    }
}
class employee extends company{
    int empid=1;
    String empname="mani";
    void emd(){
        System.out.println("Employee Id:"+empid);
        System.out.println("Employee Name:"+empname);
    }
}
class department extends employee{
    String dep="IT";
    int salary=10000;
    void ds(){
        System.out.println("Department:"+dep);
        System.out.println("Salary:"+salary);
    }
}
public class multilevel {
  public static void main(String[] args) {
    department d1=new department();
    d1.cde();
    d1.emd();
    
    d1.ds();
  }  
}
