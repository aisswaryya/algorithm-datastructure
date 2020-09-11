class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i]; 
            // System.out.println("arrSize is"+arrSize);
            //  System.out.println(" nums[i] 1 is"+ nums[i]);
        }
        
        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            
            
            Arrays.fill(result,startIdx, startIdx + nums[i], nums[i + 1]);
           //  System.out.println("startIdx is "+startIdx);
           // System.out.println("startIdx + nums[i] is "+startIdx + nums[i]);
           // System.out.println(" nums[i + 1] is "+ nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}






// class Solution {
//     public int[] decompressRLElist(int[] nums) {
//         int n = nums.length;
//         int[] frequencyArray = new int[nums.length];
//         int[] valueArray = new int[nums.length];
//         int[] result = new int[nums.length];
//             int count = 0;
//         for(int i=0; i<n; i++){
//             if(i%2==0){
//                 frequencyArray[i]=nums[i];
//             }else{
//                 valueArray[i]=nums[i];
//             }
//         }
        
//         for(int j=0;j<n;j++){
//            int freq= frequencyArray[j];
//             int value = valueArray[j];
//             for (int k=1; k<=freq; k++){
//                 result[j]= value;
//             }
//         }
        
// return result;
//  }
// }
