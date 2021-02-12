class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;  
        int wealth = 0;
        for(int i=0;i<m ;i++){
            int n = accounts[i].length;
            int sum = 0;
            for(int j=0;j< n;j++){
                sum += accounts[i][j];
               if(sum>wealth){
                    wealth = sum;
               }}
            
           }
        return wealth;
    }
}
