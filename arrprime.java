package anbu;
import java.util.*;
public class arrprime {
    public static void main(StringEX[] args) {
        int n,p=0,np=0;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n limites");
        n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
          }
          int i=2;
          if(i<arr[i]){
            for( i=2;i<arr.length+2;i++){
                if(arr[i]%i==0){
                   p++;
                }
                else if(arr[i]<2){
                   np++;

                }
                else{
                    np++;
                }
            }
          }
          System.out.println("prime number count: "+p);
          
            System.out.println("not prime number count: "+np);
          }
        
    }

