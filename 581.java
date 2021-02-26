class Solution {
    public int findUnsortedSubarray(int[] nums) {
        //clone nums and sort
        int[] cloneArr = nums.clone();
        Arrays.sort(cloneArr);
        
        int n = nums.length;
        int begin = cloneArr.length, end = 0;
        
        //compare the arrays
        for(int i=0;i<n;i++){
        if(nums[i]!=cloneArr[i]){
         begin = Math.min(begin,i);
           end = Math.max(end,i);
        }
        }
        return (end-begin >0) ? end-begin+1 :0;
    }
}
