class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int imax = 0;
        int dmax = 0;
        int l = 0;
        
        if(nums.length==1){
            return 1;
        }

        for(int r = 1; r<nums.length; r++){
            if(nums[r-1]>=nums[r]){
                l = r;
            }
            imax = Math.max(imax,r - l +1);
        }

        l = 0;

        for(int r = 1; r<nums.length; r++){
            if(nums[r-1]<=nums[r]){
                l = r;
            }
            dmax = Math.max(dmax,r - l +1);
        }
        return Math.max(imax,dmax);
    }
}