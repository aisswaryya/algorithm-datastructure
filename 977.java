class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = nums[i]*nums[i];
}
        Arrays.sort(result);
        return result;
    }
}

// class Solution {
//     public int[] sortedSquares(int[] A) {
//         int n = A.length;
//         int[] result = new int[n];
//         int i = 0, j = n - 1;
//         for (int p = n - 1; p >= 0; p--) {
//             System.out.println("p = "+p);
//             System.out.println("i = "+i);
//             System.out.println("j = "+j);
//             if (Math.abs(A[i]) > Math.abs(A[j])) {
//                 result[p] = A[i] * A[i];
//                 i++;
//             } else {
//                 result[p] = A[j] * A[j];
//                 j--;
//             }
//             System.out.println("result[p] = "+result[p]);
//         }
//         return result;
//     }
// }
