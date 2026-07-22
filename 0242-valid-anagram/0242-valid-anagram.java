class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> h = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            h.put(ch , h.getOrDefault(ch , 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(h.get(ch) != null){
                if(h.get(ch) == 1){
                    h.remove(ch);
                }else{
                    h.put(ch , h.get(ch) - 1);
                }
            }else{
                return false;
            }
        }
        return h.isEmpty();
    }
}