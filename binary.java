package anbu;
import java.util.*;
public class binary {
    public static void main(StringEX[] args) {
        int n,key,low=0,mid,high;
        boolean found=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the searching Elements:");
        key=sc.nextInt();
        high=arr.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("index elemnet"+mid);
                found=false;  
            break;          }
                else if(key>arr[mid]){
                 low=mid+1;
        }
        else{
            high=mid-1;
        }

        }
        if(found){
            System.out.println("not found");
        }
        
    }
}
