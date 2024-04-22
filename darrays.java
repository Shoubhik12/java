import java.util.*;

public class darrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("Enter no. of rows:");
        n= sc.nextInt();
        
        System.out.print("Enter no. of columns:");
        m=sc.nextInt();
        int[][] a= new int[n][m];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int[][] rarray= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rarray[i][j]= a[n-1-i][m-1-j];
            }
        }
        System.out.println("Reverse array:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(rarray[i][j]+" ");
            }
            System.out.println();
        }

    } 
}