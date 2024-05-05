import java.util.ArrayList;

public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer>a = new ArrayList<>();
        a.add(5);
        a.add(7);
        a.add(9);
        System.out.println(a);
        System.out.println(a.isEmpty());
        System.out.println(a.indexOf(7));

        System.out.println(a.lastIndexOf(9));
    }
}