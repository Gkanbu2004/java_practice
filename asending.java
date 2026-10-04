package anbu;
import java.util.Scanner;
public class asending {
    public static void main(StringEX[] args) {
        int n,large;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Elements are");
       
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        large=arr[0];
        int sl=large;
         for(int i=0;i<arr.length;i++){
           if(arr[i]>=large){
            if (large>sl) {
                large=arr[i];
            }
            
            }
            
            
        }
        System.out.println("Asecnding order");
            System.out.println(sl);
        
    }
}
