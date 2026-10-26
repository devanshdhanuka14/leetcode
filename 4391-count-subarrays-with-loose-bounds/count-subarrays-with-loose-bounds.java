class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int sublength = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]>=minK && nums[i]<=maxK){
                sublength++;
            }
            else{
                count += (long)sublength*(sublength+1)/2;
                sublength = 0;
            }
        }

        count += (long)sublength*(sublength+1)/2;

        return count;
    }
}