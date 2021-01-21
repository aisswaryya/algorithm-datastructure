class Solution {
    public int strStr(String haystack, String needle) {
        if( (!haystack.equals("") && needle.equals("")) )
                   {
            return 0;
        }
        if (haystack.equals("") && !needle.equals("")){
            return -1;
        }
        int index = haystack.indexOf(needle);
             
        
        return index;
    }
}
