class student{
    String name="mani";
    student(int id){
        System.out.println("name:"+name);
        System.out.println("ID:"+id);
    }
}
class teacher extends student{
    teacher(){
        super(100);
        System.out.println("child constructor");
    }
}
public class supercons {
    public static void main(String[] args) {
        teacher t1=new teacher();
    }
}
