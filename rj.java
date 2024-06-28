import java.util.*;

public class rj{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int i=sc.nextInt();
        // while(i>0){
        //     int num=sc.nextInt();
        //     if(num%2==0){
        //         System.out.println(num+"is even");

        //     }
        //     else if(num==0){
        //         System.out.println(num+"is zero");
        //     }
        //     else{
        //         System.out.println(num+"is odd");
        //     }
        //     i--;
        // }
        // int m =sc.nextInt();
        // while(m>0){
        //     int t =sc.nextInt();
        //     if(t>=0){
        //         System.out.println("Absolute value:\t"+t);
        //     }
        //     else{
        //         System.out.println("Absolute value:\t"+(t*-1));
        //     }
        //     m--;
        // }
        System.out.print("Enter Length:");
        int l = sc.nextInt();
        System.out.print("Enter Breadth:");
        int b = sc.nextInt();
        if(l==b){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is a  rectangle");
        }
        sc.close();
        
    }
}