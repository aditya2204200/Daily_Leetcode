class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right = 0;
        int maxLength = 0;
        int[] arr = new int[256];
        while(right < s.length()){
            int currentChar = s.charAt(right);
            int currentCharAscii = (int)currentChar;

            arr[currentCharAscii]++;

            while(arr[currentCharAscii] > 1){
                char leftChar = s.charAt(left);
                int leftCharAscii = (int) leftChar;
                arr[leftCharAscii]--;
                left++;
            }
            int currentWindowsize = right - left + 1;
            if(currentWindowsize > maxLength){
                maxLength = currentWindowsize;
            }
            right++;
        }
       return maxLength;
    }
}