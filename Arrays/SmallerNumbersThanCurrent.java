public class SmallerNumbersThanCurrent {

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] < nums[i]) {
                    count++;
                }

            }

            answer[i] = count;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        int[] result = smallerNumbersThanCurrent(nums);

        System.out.print("Output: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}