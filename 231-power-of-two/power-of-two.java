class Solution {
    public boolean isPowerOfTwo(int n) {

    
        /*if(n==1){
            return true;
        }
        while(n>1 && n%2==0){
            n=n/2;
        }
        if(n==1){
            return true;
        }
        return false;*/

        return n > 0 && (n & (n - 1)) == 0;
    }
}