class Solution {
    public int numberOfArithmeticSlices(int[] a) {
       int n= a.length;
       int[] temp =new int[n];
       int sum=0; 
        for(int i=2;i<n;i++){
           if((a[i]-a[i-1])==(a[i-1]-a[i-2])){
                temp[i] = temp[i-1]+1;
                sum +=temp[i];
               }
        }
        return sum;
    }
}
