import java.util.Arrays;

class Solution {
    public int countDistinctIntegers(int[] nums) {

        int n = nums.length;
        int[] arr = new int[2 * n];

        // Original
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        // Reverse
        for (int i = 0; i < n; i++) {
            arr[n + i] = reverse(nums[i]);
        }

        Arrays.sort(arr);

        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                count++;
            }
        }

        return count;
    }

    public int reverse(int num) {
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev;
    }
}