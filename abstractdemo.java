abstract class vehicle{
    abstract void start();
    void stop(){
System.out.println("vehicle stopped");
    }
} 
class bike extends vehicle{
    void start(){
        System.out.println("bike start with key");
    }
}
public class abstractdemo {
    public static void main(String[] args) {
        bike b1=new bike();
        b1.stop();
        b1.start();
    }
}
