package anbu;
import java.util.*;
public class arrinput {
    public static void main(StringEX[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n limit:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the "+n+" elements are:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];

        }
        System.out.println("sum of array elemnts:");
        for(int i=0;i<arr.length;i++){
            
        }System.out.println(sum);
        sc.close();
    }
}
