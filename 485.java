class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int temp=0;
        
        for(int i=0;i<nums.length; i++){
            temp +=nums[i];
            if(nums[i]==0){
                temp = 0;
            }
         //maximum value is preserved by assigning to max 
            max= Math.max(max,temp);
        }
        return max;
    }
}
