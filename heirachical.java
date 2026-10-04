class A{
    void display(){
     System.out.println("Anbumani");
    }
}
class B extends A{
    void demo(){
        System.out.println("Arulselvi");
    }
}
class C extends A{
    void demo1(){
        System.out.println("Anbuselvi");
    }
}
class D extends B{
  void demo2(){
    System.out.println("arulmani");
  }
}
public class heirachical {
    public static void main(String[] args) {
        D d1=new D();
        d1.demo2();
        d1.demo();
        C c1=new C();
        c1.demo1();
        c1.display();
        B b1=new B();
        b1.demo();
        b1.display();
    }
}
