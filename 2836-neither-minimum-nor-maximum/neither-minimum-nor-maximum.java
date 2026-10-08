class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];

        if(nums.length<=2){
            return -1;
        }

        for(int i = 1; i<nums.length; i++){
            if(nums[i] == min || nums[i] == max){
                continue;
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}