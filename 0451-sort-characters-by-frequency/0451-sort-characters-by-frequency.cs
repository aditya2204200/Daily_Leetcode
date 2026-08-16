public class Solution {
    public string FrequencySort(string s) {
        Dictionary<char ,  int> map = new Dictionary<char , int>();

        foreach(char ch in s){
            if(map.ContainsKey(ch)){
                map[ch]++;
            }else{
                map[ch] = 1;
            }
        }
        List<KeyValuePair<char, int>> list = new List<KeyValuePair<char, int>>(map);

        list.Sort((a, b) => b.Value.CompareTo(a.Value));

        
        string result = "";

        foreach (var item in list) {
            result += new string(item.Key, item.Value);
        }

        return result;
    }
}