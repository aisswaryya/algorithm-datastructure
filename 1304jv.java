var sumZero = function(n) {
    var arr = [];
    var sum = 0;
    
    for (let i = 1; i < n; i++) {
        arr.unshift(-i);
        
        sum += i;
    }
    
    arr.push(sum);
    return arr;
};
