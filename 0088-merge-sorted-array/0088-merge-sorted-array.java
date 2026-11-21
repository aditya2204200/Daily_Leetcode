class Solution { 
    public void merge(int[] arr, int m, int[] brr, int n) { 
        int[] temp = new int[m]; 
        for(int k = 0; k < m; k++) {
            temp[k] = arr[k]; 
        }
        int i = 0, j = 0, k = 0; 
        while(k < m && j < n) { 
            if(temp[k] <= brr[j]) { 
                arr[i++] = temp[k++]; 
            } else { 
                arr[i++] = brr[j++]; 
            } 
        } 
        
        while(k < m) {
            arr[i++] = temp[k++]; 
        }
        
        while(j < n) {
            arr[i++] = brr[j++]; 
        }
    } 
}
