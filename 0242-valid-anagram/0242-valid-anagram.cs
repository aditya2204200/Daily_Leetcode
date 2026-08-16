public class Solution {
    public bool IsAnagram(string s, string t) {
        if(s.Length != t.Length){
            return false;
        }
        int[] freq = new int[26];

        for(int i=0; i<s.Length; i++){
            char ch = s[i];
            freq[ch - 'a']++;
        }
        for(int i=0; i<t.Length; i++){
            char ch = t[i];
            freq[ch - 'a']--;
        }

        for(int i=0; i<26; i++){
           if(freq[i] != 0){
            return false;
           }
        }
        return true;
    }
}