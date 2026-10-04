class count{
    static int c=0;
    count(){
       c++;
        System.out.println("Object created:"+c);
    }
    void demo(){
         
    }
}
public class objectcount {
    public static void main(String[] args) {
        count c1=new count();
        count c2=new count();
        count c3=new count();
        count c4=new count();
        count c5=new count();
        
       
    }
}
