class Solution {
    public int[] replaceElements(int[] arr) {
        int n= arr.length;
        int maxv = -1, temp; // set last value to -1
        for(int i = n-1;i>=0;i--){ // start from right and move to left
           temp = arr[i];
           arr[i] = maxv;
           maxv = Math.max(temp,maxv);            
        }
        return arr;
    }
}
