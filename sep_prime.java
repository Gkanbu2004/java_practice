package anbu;

import java.util.Scanner;

public class sep_prime {
    public static void main(StringEX[] args) {
        int n,p=0,np=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the n limites: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        int prime[]=new int[n];
        int nonprime[]=new int[n];
        System.out.println("Enter the array elements: ");
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
                prime[p]=arr[i];
                p++;
            }else{
                nonprime[np]=arr[i];
                np++;
            }
            
        }
        System.err.println("Prime number");
        for(int i=0;i<p;i++){
                System.out.println(prime[i]);
        }
        System.err.println("non Prime number");
        for(int i=0;i<np;i++){
                System.out.println(nonprime[i]);
        }
}
}
