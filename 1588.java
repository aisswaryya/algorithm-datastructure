class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum =0;
        int n = arr.length;
        for (int i=0;i<n;i++){
            sum += ((i+1)*(n-i)+1)/2 *arr[i];
     }
        return sum;
    }
}

//  total times each index was added n = (i+1)* (n-i) = {left* right} = (a[0]-a[i])*(a[i]*a[n-1-i]) 
// total times in odd length array with = (n+1)/2
//total times in even length array with = n/2
