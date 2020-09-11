class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] resultArray = new int[n*2];
        for (int i=0; i<n*2;i++){
            if(i%2 == 0){
                resultArray[i]=nums[ i/2];
            }else{
                resultArray[i] = nums[n+i/2];
            }
    
        }
       return resultArray; 
    }
}