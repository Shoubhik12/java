import java.util.*;

public class pattern1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int N =  sc.nextInt();
        for(int i=1;i<=N;i++){
            
                System.out.println();
                if((i%2)==0)
                    System.out.print("   ");
            
            for(int j=0;j<N;j++){
                System.out.print("*");
            }
        }
    }
}