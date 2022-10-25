package Ass;

public class TestException {
    public static void main(String a[]) {
        String str = null;
        try {
            str.equals("Java");
        } catch(NullPointerException ex) {
            str = new String("Java");
            System.out.println(str.equals("Hello"));
        }
        System.out.println("Program Continues...");
    }
}
