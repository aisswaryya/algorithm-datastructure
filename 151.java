class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        
        //reverse whole string
        reverseArray(a, 0, n-1);
        reverseWord(a,n);
        return cleanSpaces(a,n);
    }  
    
    private void reverseArray(char[] a, int i,int j){ // reverse entire array
    while(i<j){
          char temp = a[i];
          a[i] =a[j];
          a[j] = temp;
        i++;
        j--;
        }
       }
    
    void reverseWord(char[] a, int n){ // find word and reverse
        int i=0,j=0;
           while(i<n){ //start from first character
           while(i<j || i<n && a[i] == ' ')i++; //set i where the word starts
           while(j<i || j<n && a[j] != ' ')j++;//ignore space and move across i to find the end of the word
           
           reverseArray(a, i,j-1);
       }
   }  
    
    String cleanSpaces(char[] a, int n) { //ignore extra space
    int i = 0, j = 0;
      
    while (j < n) {
      while (j < n && a[j] == ' ') j++;             // skip spaces
      while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
      while (j < n && a[j] == ' ') j++;             // skip spaces
      if (j < n) a[i++] = ' ';                      // add one space
    }  
    return new String(a).substring(0, i);
  }    
}
