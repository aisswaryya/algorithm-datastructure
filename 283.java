class Solution {
    public void moveZeroes(int[] nums) {        
        if(nums.length==0 || nums == null) return;
        int j=0;
        for(int n: nums){
            if(n!=0){
                nums[j++] = n;
            }
        }
        //if loop will only check once USE WHILE
        while(j<nums.length){
            nums[j++] =0;
        }
    }
}
