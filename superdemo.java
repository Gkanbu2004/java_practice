import java.util.*;
 class employee{
    String name;
    int salary;
    employee(String name,int salary){
      this.name=name;
      this.salary=salary;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("salayr:"+salary);
    }
}
 class superdemo {
    public static void main(String[] args) {
        employee em[]=new employee[5];
        int count=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){

System.out.println("Enter the name:");
String name=sc.next();
System.out.println("Enter the salary");
int salary=sc.nextInt();
    em[count]=new employee(name, salary);
    count ++;
}
for(int i = 0; i < 5; i++){
    em[i].display();
}
    }

}