class Solution {
    public int largestAltitude(int[] gain) {
        int n= gain.length;
        int temp =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           temp +=gain[i];
            max = Math.max(temp,max); 
}
        return max;
    }
}
