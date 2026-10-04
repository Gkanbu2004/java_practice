package anbu;
import java.util.*;
public class searching {
    public static void main(StringEX[] args) {
        int n;
         boolean found=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array Elemnts:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the searching Elements: ");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                found=false;
                System.out.println("index elemnt at"+ i);
                break;
            }
        }
        if(found){
            System.out.println("element not found");
        }
       
    }
}
