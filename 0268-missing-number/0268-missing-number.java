class Solution {
    public int missingNumber(int[] arr) {
        int n =  arr.length;
        int SumOfN = n * (n+1)/2;
        
        int sum = 0;
        for(int i=0; i<n; i++){
           sum += arr[i];
        }

        return (SumOfN - sum);
    }
}