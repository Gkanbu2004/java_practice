import java.util.*;
public class projectsample {
    public static void main(String[] args) {
        int age,mark,uc=0,lc=0,v=0,w=1;
        String name,dep;
        char n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        name=sc.nextLine();
        System.out.println("Enter the Age:");
        age=sc.nextInt();
         System.out.println("Enter the marks:");
        mark=sc.nextInt();
         System.out.println("Enter the department:");
        dep=sc.next();
        System.out.println("----------Student Details----------------");
        for(int i=0;i<name.length();i++){
            n=name.charAt(i);
            if(n=='A'||n=='E'||n=='I'||n=='O'||n=='U'||n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
                v++;
            }
            if(n>='A'&&n<='Z'){
               uc++;
            }
            else if(n>='a'&&n<='z'){
                lc++;
            }
            if(n==' '){
                w++;
            }

            
        }
        char grade='-';
        String res="Invalid";
        if(mark>=0&&mark<=100){
            if(mark>=90){
               grade='A';
               res="pass";
            }
            else if(mark>=80){
                 grade='B';
               res="pass";
            }
             else if(mark>=70){
                 grade='C';
               res="pass";
            } else if(mark>=60){
                grade='D';
               res="pass";
            } else if(mark>=50){
                 grade='E';
               res="pass";
            }
            else{
                 grade='F';
               res="fail";
            }
       
        }
         else{
            System.out.println("mark invalid");
        }
           System.out.println("NAME                  :"+name);
           System.out.println("DEPARTMENT            :"+dep);
           System.out.println("AGE                   :"+age);
           System.out.println("MARKS                 :"+mark);
           System.out.println();
           System.out.println("UPPERCASE COUNT       :"+uc);
           System.out.println("LOWERCASE COUNT       :"+lc);
           System.out.println("VOWELS COUNT          :"+v);
           System.out.println("WORDS COUNT           :"+w);
           System.out.println();
           System.out.println("GRADE                 :"+grade);
           System.out.println("RESULT                :"+res);
         
    }
}
