package anbu;
import java.util.*;
public class avgarr {
    public static void main(StringEX[] args) {
        int n,sum=0;
        double avg;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Array Elements are:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           
             }
              avg=(double)sum/arr.length;
            
     System.out.println(avg);
       
    }
}
