class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res= new int[2];
        int i=0;
        int j= numbers.length-1;
       
        while(i<j){
           int  temp = numbers[i]+numbers[j];
           if(temp==target){
                    res[0] = i+1;
                    res[1]=j+1;   
                    break;
            }else if(temp<target){
               //move forward pointer to next index
                i++;
            }else{
               //move backward pointer to prev index
                j--;
            }
        }
        return res;
    }
}


//Solution 2

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
        
//         int[] index = new int[2];
//         int len = numbers.length;
        
//         for(int i=0; i<len-1;i++){
//             for(int j=i+1;j<len;j++){
//                 if(numbers[i]+numbers[j]==target){
//                     index[0] =i+1;
//                     index[1] =j+1;
//                 }
//             }
//         }
//         return index;
//     }
// }
