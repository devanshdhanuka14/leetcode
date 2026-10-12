class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}




////// HAVE TO DO THIS AGAIN WITH THE QUICKSLECT METHOD