class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num) +1);
            } else {
                map.put(num ,1);
            }
            if(map.get(num) ==nums.length/3+1) list.add(num);
        }
        return list;
        
    }
}