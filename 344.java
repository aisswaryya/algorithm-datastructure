class Solution {
    public void reverseString(char[] s) {
        int l = s.length;
        int i=0, j= l-1;
        
        while(i<j){
            char temp = s[i];
            s[i] =s[j];
            s[j] = temp;
            i++;
            j--;
        }
       // System.out.println(s);
    }
}
