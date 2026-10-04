package anbu;
import java.util.*;
public class addmatrix {
    public static void main(StringEX[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row limtes");
        r=sc.nextInt();
        System.out.println("Enter column limtes");
        c=sc.nextInt();
        System.out.println("matrix A:");
        int arr[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        int arr3[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("matrix B:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
            System.out.println();
    }
    System.out.println("Matric A are");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
     System.out.println("Matric B are");
     for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr2[i][j]);
        }
        System.out.println();
    }
    System.out.println("Sum of two matrics are:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
        arr3[i][j]=arr[i][j]+arr2[i][j];
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
        System.out.print(arr3[i][j]);
        }
        System.out.println();
    }

}
}

