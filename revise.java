import java.util.*;

public class revise{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] a = new int[sc.nextInt()];
        // for(int i=0;i<a.length;i++){
        //     a[i]=sc.nextInt();
        // }
        // int k=0,m=a.length-1;
        // while(k<m){
        //     a[k]=a[k]+a[m];
        //     a[m]=a[k]-a[m];
        //     a[k]=a[k]-a[m];
        //     k++;
        //     m--;
        // }
        // System.out.println("Reversed array:");
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        ArrayList<Integer>num = new ArrayList<>();
        System.out.print("Enter the size:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());

        }
        System.out.println(num);
        int t=0,m=num.size()-1;
        while(t<m){
            int l= num.get(t);
            int g= num.get(m);
            l=l+g;
            g=l-g;
            l=l-g;
            num.set(t, l);
            num.set(m, g);
            t++;
            m--;

        }
        System.out.println("Reversed array:"+num);
        sc.close();
        
    }
}