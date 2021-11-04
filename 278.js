 const solution = isBadVersion => (n, lo = 1, hi = n) => {
           while (lo <= hi){
               const mid = ~~(lo + (hi - lo) / 2); //pivot
               if (!isBadVersion(mid)) lo = mid + 1; //if pivot is not Bad version(false) returns if(true)
               else hi = mid-1;
           }
    return lo
};

