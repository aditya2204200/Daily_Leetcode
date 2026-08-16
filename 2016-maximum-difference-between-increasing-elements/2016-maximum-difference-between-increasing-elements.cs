public class Solution {
    public int MaximumDifference(int[] nums) {
        int diff = nums[0];
        int max = -1;
        
        for(int i=1; i<nums.Length; i++){

           if(nums[i] > diff){
             max = Math.Max(max , nums[i] - diff);
           }
           else{
            diff = nums[i];
           }
           
        }
        return max;
    }
}