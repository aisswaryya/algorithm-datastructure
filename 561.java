class Solution {
    public int arrayPairSum(int[] nums) {
        int odd=0;
        int even = 0;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i +=2){
            sum +=nums[i];
         // if (i % 2 == 0) 
        //     even += nums[i]; 
        // else
        //     odd += nums[i]; 
        }
        return sum;
    }
}
