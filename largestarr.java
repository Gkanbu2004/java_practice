package anbu;
import java.util.*;
public class largestarr {
    public static void main(StringEX[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array value:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}
