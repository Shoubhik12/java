import java.util.*;

public class convertion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int dnum= sc.nextInt();
        int bnum=0,pow=1;
        while(dnum>0){
          int fact = dnum%2;
          bnum= bnum+(fact*pow);
          pow= pow*10;
          dnum=dnum/2;
        }
        System.out.println("Binary number"+bnum);


    }
}