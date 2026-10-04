class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
    void dis(){
        super.sound();
        sound();
    }
}
public class supermethod {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.dis();
    }
}
