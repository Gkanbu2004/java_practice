package anbu;
import java.util.*;
public class pn {
    public static void main(StringEX[] args) {
        int n,p=0,np=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elemnts are:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++){
            boolean isprime=true;
            if(arr[i]<2){
                isprime=false;
            }
            else{
                for(int j=2;j<arr[i];j++){
                    if(arr[i]%j==0){
                        isprime=false;
                        break;
                    }
                }
            }
            if(isprime){
            p++;
        }else{
            np++;
        }
        }
        System.out.println(p);
        System.out.println(np);
        
    }
}
