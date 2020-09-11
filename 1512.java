class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n= nums.length;
        int count = 0;
               
        // if(nums[0]== nums[3]){
        //     return nums[1];
        // }else{
        //     return nums[2];
        // }
            
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                 count++;  
                }
            }
        
        } 
        return count;
    }
}