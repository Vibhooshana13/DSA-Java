public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }

    public static void main(String[] args) {

        int n = 16;

        boolean result = isPowerOfTwo(n);

        System.out.println(n + " is power of two: " + result);
    }
}