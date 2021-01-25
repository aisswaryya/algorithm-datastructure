class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int start =0;
        int sum=0;
        int minLength = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
                     sum +=nums[i];
                     while(sum>=s){
                         //when sum==s to the possible minimum value 
                 minLength = Math.min(minLength,i+1-start);  
                         //subtracting elements from left one by one to find the minimum length
                sum -= nums[start++];
            }
        }
        //minLength is set to the least value using Math
        return minLength !=Integer.MAX_VALUE? minLength:0;
    }
}
