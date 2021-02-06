class Solution {
    public int findLHS(int[] nums) {
       int n = nums.length;
        int res =0;
        for(int i=0;i<n;i++){
            int count = 0;
            boolean flag = false;
        for(int j=0;j<n;j++){
                if(nums[i]==nums[j])count++;
                    else if(nums[i]==nums[j]+1){ 
                        count++;
                        flag =true;                        
                }           
        }
            if(flag)
             res = Math.max(res,count);
        }
        return res;
    }
}
