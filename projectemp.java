import java.util.*;

import anbu.arr;
public class projectemp {
    public static String reverse(String name){
        String str="";
        for(int i=name.length()-1;i>=0;i--){
            str+=name.charAt(i);
        }
        return str;
    }
    public static int vowels(String name){
        int v=0;
        for(int i=0;i<name.length();i++){
            char n=name.charAt(i);
            if(n=='A'||n=='E'||n=='I'||n=='O'||n=='U'||n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
                v++;
            }
        }
        return v;
    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int high(int arr[]){
        int h=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>h){
                h=arr[i];
            }
        }
        return h;
    }
    public static int low(int arr[]){
        int l=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<l){
                l=arr[i];
            }
        }
        return l;
    }
    public static int total(int arr[]){
        int t=0;
        for(int i =0;i<arr.length;i++){
            t+=arr[i];
        }
        return t;
    }
    public static double Avg(int arr[]){
        int t=0;
        for(int i =0;i<arr.length;i++){
            t+=arr[i];
        }
        double a= (double)t/arr.length;
        return a;
    }
    public static char grade(double a) {
         if(a<=100&&a>=0){
        if(a>=90){
            return 'A';
        }
        else if(a>=80){
            return 'B';
        }
        else if(a>=70){
            return 'C';

        }
        else if(a>=60){
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
        int n1,id,salary;
        double a;
        String dep,name;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Employee Name:");
        name=sc.nextLine();
        System.out.println("Enter Employee ID:");
        id=sc.nextInt();
        System.out.println("Enter Department:");
        dep=sc.next();
        System.out.println("Enter Salary:");
        salary=sc.nextInt();
        System.out.println("Enter Array Size:");
        n1=sc.nextInt();
        System.out.println("Enter Performance Scores:");
        int arr[]=new int[n1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("========== EMPLOYEE REPORT ==========");
        System.out.println("ID                     :"+id);
        System.out.println("NAME                   :"+name);
        System.out.println("DEPARTMENT             :"+dep);
        System.out.println("SALARY                 :"+salary);
        System.out.println();
        System.out.println("REVERSE NAME           :"+reverse(name));
        System.out.println("VOWELS                 :"+vowels(name));
        System.out.println();
        System.out.println("PERFORMENSE SCORE:");
         for(int i=0;i<=n1-1;i++){
            System.out.print(arr[i]+" ");
        }
       sort(arr);
       System.out.println();
       System.out.println("Highest SCORE            :"+high(arr));
       System.out.println("LOWEST SCORE             :"+low(arr));
       System.out.println("SUM SCORE                :"+total(arr));
       System.out.println("AVERAGE SCORE            :"+Avg(arr));
       System.out.println();
       System.out.println("GRADE                    :"+grade(Avg(arr)));


        

    }
}
