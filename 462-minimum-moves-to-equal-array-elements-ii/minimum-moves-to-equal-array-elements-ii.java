class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int moves = 0;
        int min = Integer.MAX_VALUE;
        int mid = nums[(n/2)];
        for(int i = 0; i<n/2; i++){
            moves += mid-nums[i];
        }

        for(int i = n/2; i<n; i++){
            moves += nums[i]-mid;
        }
        return moves;
    }
}