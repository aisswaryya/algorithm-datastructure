class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        int sum=0;
       
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
            sum=nums[i]+nums[j];
            if(sum==target){
         
                return new int[] {i,j};
                
            }                     
          }
        }

         return new int[]{};
        }
   
}
    
