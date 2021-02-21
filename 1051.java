class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] temp = heights.clone();
        Arrays.sort(temp);
        int count=0;
        for(int i=0;i<n;i++){
            System.out.println(heights[i]);
            if(heights[i] != temp[i]) count++;
        }
        return count;
    }
}

// class Solution {
//     public int heightChecker(int[] heights) {
//         int[] heightToFreq = new int[101];
        
//         for (int height : heights) {
//             heightToFreq[height]++;
//         }
        
//         int result = 0;
//         int curHeight = 0;
        
//         for (int i = 0; i < heights.length; i++) {
//             while (heightToFreq[curHeight] == 0) {
//                 curHeight++;
//             }
            
//             if (curHeight != heights[i]) {
//                 result++;
//             }
//             heightToFreq[curHeight]--;
//         }
        
//         return result;
//     }
// }
