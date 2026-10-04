class Shape{
    void draw(){
        System.out.println("Draw shape");
    }
}
class circle extends Shape{
    void draw(){
        super.draw();
        System.out.println("Draw circle");
    }
}
public class methodoverride {
    public static void main(String[] args) {
        circle C1=new circle();
        C1.draw();
    }
}
