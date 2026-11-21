class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i = 0; i<nums.length; i++){
            x = Math.abs(nums[nums.length-1]-nums[2]);
            y = Math.abs(nums[0]-nums[nums.length-3]);
            z = Math.abs(nums[nums.length-2]-nums[1]);
        }
        return (Math.min(Math.min(x,y),z));
    }
}