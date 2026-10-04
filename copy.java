package anbu;
import java.util.*;
public class copy {
    public static void main(StringEX[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limtes:");
        n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("copide array");
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
            System.out.println(arr2[i]);
        }
    }
}
