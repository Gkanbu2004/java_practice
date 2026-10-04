package anbu;
import java.util.*;
public class primenonprime {
    public static void main(StringEX[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the" +n+ "array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       int p=0,np=0;      
       for(int i=0;i<arr.length;i++){
        int c=0;
        for(int j=1;j<=arr[i];j++){
            if(arr[i]%j==0){
                c++;
            }
        }
        if(c==2){
        p++;
       }else{
        np++;
       }
       }
       
System.out.println("prime count"+p);
System.out.println("non prime count"+np);       
 }

    }
