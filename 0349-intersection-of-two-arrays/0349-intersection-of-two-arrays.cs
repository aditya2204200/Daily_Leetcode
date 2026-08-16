class Solution {
    public int[] Intersection(int[] nums1, int[] nums2) {
        HashSet<int> set = new HashSet<int>();
        for(int i=0; i<nums1.Length; i++){
            set.Add(nums1[i]);
        }
        List<int> list = new List<int>();
        for(int i=0; i<nums2.Length; i++){
            if(set.Contains(nums2[i])){
                list.Add(nums2[i]);
                set.Remove(nums2[i]);
            }
        }
        int[] res = new int[list.Count];
        for(int i=0; i<list.Count; i++){
            res[i] = list[i];
        }
        return res;
    }
}
