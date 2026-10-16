class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxcurr = nums[0];
        int mincurr = nums[0];
        int max = nums[0];
        int min = nums[0];

        for(int i = 1; i<nums.length; i++){
            maxcurr = Math.max(nums[i], maxcurr + nums[i]);
            mincurr = Math.min(nums[i], mincurr + nums[i]);
            max = Math.max(max, maxcurr);
            min = Math.min(min, mincurr);

        }

        if(min<0){
            min = -1 * min;
            if(min>max){
                return min;
            }
        }
        
        return max;
    }
}