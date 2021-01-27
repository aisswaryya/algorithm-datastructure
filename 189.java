class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        //reverse nums
        reverse(nums,0,len-1);
        //reverse till k-1
        reverse(nums,0,k-1);
        //reverse k to len-1
        reverse(nums,k,len-1);
    }    
    //i=start, j=end
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
    }
}
