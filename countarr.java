package anbu;
import java.util.*;
public class countarr {
    public static void main(StringEX[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites: ");
        n=sc.nextInt();
        int arr []=new int[n];
        System.out.println(("array elements are: "));
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
           
            }
            int e=0;
            int o=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                 e++;
           }
           else{
              o++;
           }
 
            
            }
            System.out.println(e+" ");
            System.out.println(o+" ");
            
 }
}
 
