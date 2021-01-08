/**
 * @param {number[]} A
 * @return {number[]}
 */

//solution 1
var sortArrayByParity = function(A) {
    var b =[];
    var c =[];
    
    for(i=0; i< A.length;i++){
        if( A[i]%2!=0){
            c.push(A[i]);
        }
}
    
    for(i=0;i< A.length;i++){
        if( A[i]%2==0){
            b.push(A[i]);
        }
}
    
    return A = b.concat(c);
    
};


//solution 2
var sortArrayByParity = function(A) {
    const temp = [];
    A.forEach(v => {
        v % 2 === 0 ? temp.unshift(v) : temp.push(v);
    })
    
    return temp;
};


//solution 3

var sortArrayByParity = function(A) {
    return [...A.filter(v => v % 2 === 0), ...A.filter(v => v % 2 !== 0)];
};
