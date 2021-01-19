class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>(); 
        
        // check for empty matrix
        
        if(matrix == null || matrix.length == 0) {return result;}
        
        //set boundary value, size 
        
        int rowS = 0, rowE = matrix.length-1, columnS = 0, columnE = matrix[0].length-1 , elements = matrix.length * matrix[0].length;
                
        while(result.size() < elements ){
        
            for( int i=columnS; i<=columnE && result.size() < elements ; i++){
           result.add(matrix[rowS][i]);
            }
            rowS++;
            
            for(int i= rowS; i<=rowE && result.size() < elements; i++){
                result.add(matrix[i][columnE]);
            }
            columnE--;
            
            for(int i=columnE; i>=columnS && result.size() < elements; i--){
                  result.add(matrix[rowE][i]);
                }
            rowE--;
            
            for(int i=rowE; i>= rowS && result.size() < elements ; i--){
                result.add(matrix[i][columnS]);
            }
            columnS++;
            
         }
        
        return result;
    }
}
