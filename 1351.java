/**
 * @param {number[][]} grid
 * @return {number}
 */

const countNegatives = grid =>
  grid.reduce((accumulator, current) => accumulator + current.filter(n => n < 0).length, 0);





//version 1 (don't work for no of row != no of column)
// var countNegatives = function(grid) {
//     var row ;
//     var column ;
//     var count =0;
    
//     for(row = 0; row<grid.length; row++){
//         for(column= 0;column<grid.length; column++){
//             if(grid[row][column]< 0){
//             count++;
//             }
//         }
     
// }
//      return count;      
// }
   

