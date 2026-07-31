public class AddDigits{
    public static void main(String[] args) {
        int num = 38;
        int sum;
        int temp;

        while (num > 9) {
            sum = 0;

            while (num > 0) {
                temp = num % 10;
                sum += temp;
                num = num / 10;
            }

            num = sum;
        }

        System.out.println(num);
    }
}