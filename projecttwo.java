import java.util.*;
public class projecttwo {
   public static int vowelcount(String name){
        int v=0;
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    v++;
                }
        }
                 return v;

}
public static String reverse(String name) {
    String rev="";
    for(int i=name.length()-1;i>=0;i--){
        rev=rev+name.charAt(i);
    }
    return rev;

    
}
public static int array(int arr[]){
int total=0;
for(int i=0;i<arr.length;i++){
    total+=arr[i];
}
return total;
}
public static int large(int arr[]){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    }
return max;

}
public static char marks(int mark){
    if(mark<=100&&mark>=0){
        if(mark>=90){
            return 'A';
        }
        else if(mark>=80){
            return 'B';
        }
        else if(mark>=70){
            return 'C';

        }
        else if(mark>=60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    else{
        return 'N';
    }
}


   
    public static void main(String[] args) {
        int n,mark;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        name=sc.nextLine();
         System.out.println("Enter the mark:");
        mark=sc.nextInt();
         System.out.println("Enter the array limit:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("-------------Student Details----------------");
        System.out.println("NAME                    :"+ name);
        System.out.println("REVERSE NAME            :"+reverse(name));
        System.out.println("VOWELS                  :"+vowelcount(name));
        System.out.println("ARRAY SUM               :"+array(arr));
        System.out.println("LARGEST                 :"+large(arr));
        System.out.println("MARK:                   :"+mark);
        System.out.println("GRADE                   :"+marks(mark));
    }
    
}
