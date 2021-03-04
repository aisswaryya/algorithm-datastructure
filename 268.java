class Solution {
      public int missingNumber(int[] nums) { //sum
    int len = nums.length;
    int sum = (0+len)*(len+1)/2; /// sum of n numbers n*((n/2) +1)
    for(int i=0; i<len; i++)
        sum-=nums[i];
    return sum;
} 
}

//  public int missingNumber(int[] nums) {
//         int n= nums.length;
//         Arrays.sort(nums);
//         int sum=0;
//         for(int i=0;i<n;i++){
//           if(nums[i] != sum) {
//               return sum;
//           }
//             sum +=1;
              
//         }
//         return sum;
//     }
