package anbu;
import java.util.*;
public class upper {
    public static void main(StringEX[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row limtes");
        r=sc.nextInt();
        System.out.println("Enter column limtes");
        c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.print("A =");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
         for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(i>=j){
                    System.out.print(a[i][j]);
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
          
        }

    }
}
