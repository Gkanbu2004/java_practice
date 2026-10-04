class A{
    int a=5;
}
class B extends A{
    int a=10;
    void sum(){
        int c=super.a+a;
        System.out.println("c:"+c);
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class supervar {
    public static void main(String[] args) {
        B b1=new B();
        b1.sum();
    }
}
