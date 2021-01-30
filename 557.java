class Solution {
    public String reverseWords(String s) {
        
        char[]  a = s.toCharArray();
        int n = a.length;
        
        reverseWord(a,n);
        String result = new String(a); 
        return result;
    } 
        
     private void reverse(char[] a,int i,int j){  //reverse word
        while(i<j){
            char temp = a[i];
            a[i] =a[j];
            a[j]=temp;
            i++;
            j--;
        }
      }  
   
        
        void reverseWord(char[] a, int n){ //find word
            int i=0,j=0;
        while(i<n){
            while(i<j || i<n && a[i]==' ') i++;
            while(j<i || j<n && a[j] !=' ') j++;
            reverse(a,i,j-1); 
        }
      }
                
}
