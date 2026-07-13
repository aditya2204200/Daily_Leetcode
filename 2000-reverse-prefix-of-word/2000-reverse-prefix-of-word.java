class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c = word.toCharArray();
        int left = 0;
        int right = word.indexOf(ch);

        if(right == -1) return word;
        
        while(left < right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }

        return new String(c);
    }
}