import java.util.*;


public class arrays{

    public static int countArray(int[] arr,int e){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
                count++;
            }
        }
        return count;

    }

    public static int lastOccurance(int[] arr,int e){
        int val=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
               val=i;
            }
        }
        return val; 
    }

    public static void greater(int[] arr,int e){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>e){
                System.out.println(arr[i]);
            }
        }
    }

    public static void sort(int[] arr){
     for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            System.out.println("The array is not sorted");
            break;
        }
       
        
    }
    }

    public static void ksort(int[] arr,int k){
        Arrays.sort(arr);
        // for(int i=0; i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        int m = arr.length-k;
        System.out.println("smallest"+k+"th element:"+arr[k-1]);
        System.out.println("largest"+k+"th element:"+arr[m]);
    }

    public static int[] smallestlargestelement(int[] arr){
        int[] smallestlargestelement= new int[2];
        int m=0,n=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>m){
                m=arr[i];
            }
            
        }
        n=m;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<n){
                n=arr[i];
            }
        }

        smallestlargestelement[0]=m;
        smallestlargestelement[1]=n;
        return smallestlargestelement;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int n,m,t;
        System.out.print("Enter the size of the array: ");
        n= sc.nextInt();
        a= new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // System.out.println("Enter the element to be searched:");
        // m=sc.nextInt();
        // t= countArray(a, m);
        // System.out.println("Count of the element in the array:"+t);
        // System.out.println("Enter the element:");
        // m=sc.nextInt();
        // greater(a, m);
        //sort(a);
        // int[] arr2=smallestlargestelement(a);
        // for(int i=0;i< arr2.length;i++){
        //     System.out.println(arr2[i]);
        // }
        ksort(a, 3);
    }
    
    
}