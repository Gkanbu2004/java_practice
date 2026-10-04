package anbu;
import java.util.*;
public class arrmax {
    public static void main(StringEX[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the arr elements:");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        } 
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}
