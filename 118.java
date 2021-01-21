class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<List<Integer>>(); 
        
        if( numRows==0) return triangle;
        
        for(int i=0; i< numRows; i++){
        //create row
            List<Integer> row = new ArrayList<Integer>();
            for(int j=0; j<=i; j++){
            //first and last element of each row set to 1
                if(j==0 || j==i){
                     row.add(1);
                }else{
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }  
            // add row list to triangle list
      triangle.add(row);      
      }
        return triangle;
            }
}
