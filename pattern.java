public class pattern{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){

            for(int k=4;k>=i;k--){
                System.out.print(" ");
            }

             if(i==2 ){
                 System.out.print(i+" ");
             }

             if(i==3){
                System.out.print(i+"   ");
             }

            for(int j=1;j<=i;j++){
             

              if(i==1 || i==4)
                  System.out.print(i);
            }

            if(i==2 || i==3){
                System.out.print(i);
            }
            
            for(int m=2;m<=i;m++)
            { 
                if(i==4)
                   System.out.print(i);
            }

            System.out.println("");


        }
    }
}