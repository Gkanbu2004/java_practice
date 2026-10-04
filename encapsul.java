class student{
private int id,mark;
private String name;
public void setid(int i){
    id=i;
}
public int getid(){
    return id;
}
public void setname(String na){
    name=na;
}
public String getname(){
    return name;
}
public void setmark(int ma){
    mark=ma;
}
public int getmark(){
    return mark;
}
}
public class encapsul {
    public static void main(String[] args) {
        student s1=new student();
        s1.setid(1);
        s1.setname("mani");
        s1.setmark(100);
        System.out.println("ID:"+s1.getid());
        System.out.println("NAME:"+s1.getname());
        System.out.println("Mark:"+s1.getmark());
    }
}
