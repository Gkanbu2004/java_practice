import java.util.*;
class student{
    int id,age;
    String name;
    public void Demo(){
        System.out.println("NAME:"+name);
        System.out.println("ID:"+id);
        System.out.println("AGE:"+age);
    }
}
public class objectex {
    public static void main(String[] args) {
        student s1=new student();
        Scanner sc=new Scanner(System.in);
        s1.name=sc.next();
        s1.age=sc.nextInt();
        s1.id=sc.nextInt();
        System.out.println();
         student s2=new student();
       
        s2.name=sc.next();
        s2.age=sc.nextInt();
        s2.id=sc.nextInt();
        s1.Demo();
        s2.Demo();
    }
}
