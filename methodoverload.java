class Demo{
 void add(int a,int b){
  int c=a+b;
  System.out.println("add:"+c);
 }
 void add(double a,double b){
    double c=a*b;
    System.out.println("mul of:"+c);
 }
 void add(int a,int b,int c){
    int d=(a+b+c)/3;
    System.out.println("avg:"+d);
 }

}
public class methodoverload {
    public static void main(String[] args) {
        Demo d1=new Demo();
        d1.add(10,20);
        d1.add(10.5,80.3);
        d1.add(10,20,30);
    }
}
