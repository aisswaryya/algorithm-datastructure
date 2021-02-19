class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0,mid =0;
        for(int i=0;i<n;i++){
             mid = mat[n-1-i][i]; //primary diagonal
             sum += mat[i][i]; //secondary diagonal
            sum += mat[n-1-i][i];
            }
          return n%2==0 ? sum : sum - mat[n/2][n/2]; // if n is odd subtract mid value 
    }
}

// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int n = mat.length;
//         int sum =0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(i==j || (i == n- j-1)){
//             sum += mat[i][j];  
//                }
//         }
//         }
//         return sum;
//     }
// }
