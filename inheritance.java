package anbu;
class student{
    int id=10;
    String name="mani";
    void std(){
        System.out.println("ID:"+id);
        System.out.println("NAME:"+name);
    }

}
class college extends student{
    String clg="MAMCET";
    String sep="cse";
    void cl(){
        System.out.println("COLLEGE:"+clg);
        System.out.println("DEP:"+sep);
    }
}
public class inheritance {
    public static void main(String[] args) {
        college in=new college();
        in.std();
        in.cl();
    }
}
