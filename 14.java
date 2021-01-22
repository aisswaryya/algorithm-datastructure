class Solution {
    public String longestCommonPrefix(String[] strs) {
        //check for empty array
        if( strs == null || strs.length == 0) return "";
        //set first string as pre
        String pre = strs[0];
        //start comparing from index 1
        int i=1;
        // make sure we dont's run out of strings in array
        while(i< strs.length){
            // if pre is present in strs[i]
            while(strs[i].indexOf(pre)!=0){
                //set pre to chars that match all the string i.e untill !=0
            pre = pre.substring(0, pre.length()-1);
            }
            //move to next element in the array
             i++;
        }   
      return pre; 
    }
}
