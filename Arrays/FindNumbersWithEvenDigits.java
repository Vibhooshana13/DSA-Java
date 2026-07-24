public class FindNumbersWithEvenDigits {

    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int number = nums[i];
            int digits = 0;

            while (number > 0) {
                number = number / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        int result = findNumbers(nums);

        System.out.println("Output: " + result);
    }
}