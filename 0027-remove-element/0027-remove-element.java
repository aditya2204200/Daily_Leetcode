class Solution {
    public int removeElement(int[] nums, int val) {
        int count =0;
        int n = nums.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(nums[i] != val){
              nums[j] = nums[i];
              j++;
              count++;
            }
        }
        return count;
    }
}