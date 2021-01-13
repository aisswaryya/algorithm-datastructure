class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i=len-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
            return digits;
            }
           
            digits[i]=0;
            
        }
        
         int[] newArray = new int[len+1];
        newArray[0] = 1;
        // for ( int i=0;i<len;i++){
        //     newArray[i] = digits[i];
        // }
       return newArray;
    }
}



// class Solution {
//     public int[] plusOne(int[] digits) {
//         int[] a= new int[digits.length];
//         int temp=0;
//         for( int i=digits.length-1; i>=0; i++){
//             if(i<digits.length-1){
//             a[i] = digits[i];
//             }
//             while(i== digits.length-1){
//                 a[i] = digits[i]+1;
//             }
            
//         }
//        for(int j=0;j<digits.length;j++){
//            return a
//        }
//         return a;
//     }
// }
