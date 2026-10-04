package anbu;
import java.util.*;
public class arrreverse {
    public static void main(StringEX[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites: ");
        n=sc.nextInt();
        int arr []=new int[n];
        int arr2[];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=n-1;i>=0;i--){
             System.out.println(arr[i]);
        }
    }
}
