public class stringpalindrom2{

    public static void main(String[] args) {
        String  str1 = "eye";
        String str2="";
        int i;
        for(i=str1.length();i>0;i--)
        {
            str2= str2+str1.charAt(i-1);
        }
        
        System.out.println(str2);
        if(str2.equalsIgnoreCase(str2))
           System.out.println(str1+" is a palindrom");
        else
           System.out.println(str1+" is not a palindrom");
    }
}