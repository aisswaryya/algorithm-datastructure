class Solution {
    public int brokenCalc(int x, int y) {
        int count =0;
        while(y>x){
            y = y%2>0 ? y+1 : y/2;
            count++;
        }
        return count + x - y;
    }
}

// change Y to X
// Opertation 1: Y = Y / 2 if Y is even
// Opertation 2: Y = Y + 1
