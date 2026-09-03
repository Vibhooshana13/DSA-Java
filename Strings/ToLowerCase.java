public class ToLowerCase {

    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {

        String s = "Hello WORLD";

        String result = toLowerCase(s);

        System.out.println("Output: " + result);
    }
}