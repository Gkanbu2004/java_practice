package anbu;
import java.util.*;
public class reversearr {
    public static void main(StringEX[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limtes: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Elements: ");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reverse array are:");
        for(i=n-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }

}
