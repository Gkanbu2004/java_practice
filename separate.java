package anbu;
import java.util.*;
public class separate {
    public static void main(StringEX[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the n limites: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        int even[]=new int[n];
        int odd[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int e=0,o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[e]=arr[i];
                e++;
            }
            else{
                odd[o]=arr[i];
                o++;
            }
        }
        System.out.println("Even Numbers");
        for(int i=0;i<e;i++){
            System.out.println(even[i]);
        }
        System.out.println("odd Numbers");
        for(int i=0;i<o;i++){
            System.out.println(odd[i]);
        }
    }
}
