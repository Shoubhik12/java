public class stringpalindrom{
    public static void main(String[] args) {
        String c= "shoubhik";
    
        String d="" ;
        for(int i= c.length();i>0; --i) 
        {
            d= d+c.charAt(i-1);
        }
        System.out.println(d);

    }
}