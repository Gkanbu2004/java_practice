class Student {

    int id;
    int mark;
    String name;

    void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Mark : " + mark);
    }
}

public class NormalProgram {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 10;
        s1.name = "Anbumani";
        s1.mark = 95;

        s1.display();
    }
}