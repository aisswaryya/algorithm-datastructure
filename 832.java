class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int len= A.length; //Column len= row length
        for(int[] row: A){ 
            for (int i=0; i*2<len;i++){ //to check remaining elements to compare i*2<n
                if(row[i]==row[len-1-i]){ // first and last
                    row[i]=row[len-1-i] ^= 1; //XOR operation
                }
            }
        }
         return A;
    }
}
