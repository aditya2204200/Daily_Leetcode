class Solution {
    public void rotate(int[] arr, int d) {
        d = d % arr.length;
        

        int k=0;
        int j = arr.length - 1;
        
        while(k < j){
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k++;
            j--;
        }
        k = 0;
        j = d - 1;
        while(k < j){
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k++;
            j--;
        }
        
        k = d;
        j = arr.length - 1;
        
        while(k < j){
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
            k++;
            j--;
        }
    }
}