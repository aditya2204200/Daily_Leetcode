class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right = 0;
        int maxLength = 0;
        HashMap<Character , Integer> map =  new HashMap<>();
        int[] arr = new int[256];
        while(right < s.length()){
            char currentChar = s.charAt(right);

            if(map.containsKey(currentChar)){
                int lastIndex = map.get(currentChar);
                int newLeft = lastIndex + 1;
                if(newLeft > left){
                    left = newLeft;;
                }
            }

            map.put(currentChar , right);
        
            int currentWindowsize = right - left + 1;
            if(currentWindowsize > maxLength){
                maxLength = currentWindowsize;
            }
            right++;
        }
       return maxLength;
    }
}