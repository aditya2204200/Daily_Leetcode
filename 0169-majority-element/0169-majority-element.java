class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> h = new HashMap<>();
        int n = nums.length;

        for (int num : nums) {

            if (h.containsKey(num)) {
                h.put(num,h.get(num) + 1);
            } else {
                h.put(num, 1);
            }
            if (h.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }
}