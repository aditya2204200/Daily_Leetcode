class Solution {
    public int minSteps(String s, String t) {
        int[] freq1 = new int[26];

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            freq1[ch - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq1[ch - 'a']--;
        }
        int ans = 0;

        for(int i=0; i<26; i++){
            if(freq1[i] > 0){
                ans += freq1[i];
            }
        }
        return ans;
    }
}