import java.util.*;


public class suffix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=n-2;i>=0;i--){
            a[i]= a[i]+a[i+1];

        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }

    }
}