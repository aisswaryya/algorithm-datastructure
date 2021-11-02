/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */


// var search = function(nums, target) {
//     let lo = 0, hi = nums.length-1;
//     while (lo < hi) {
//         let mid = lo + Math.floor((hi-lo+1)/2);
//         if (target < nums[mid]) {
//             hi = mid - 1
//         } else {
//             lo = mid; 
//         }
//     }
//     return nums[lo]==target?lo:-1;
// };

   // my solution
var search = function(nums, target) {
    let median = Math.floor(nums.length/2 );
    if(!nums.includes(target)){
        return -1;
    }else if(target <nums[median]){        
        for(let i=median-1; i>=0;i--){
            if(target==nums[i]) return i;}
        }else if(target>nums[median]){             
           for(let i=median; i>=0;i++){
            if(target==nums[i]) return i;} 
        } else return median;
}   