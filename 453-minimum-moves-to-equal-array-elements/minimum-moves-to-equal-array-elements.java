class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            min = Math.min(min,nums[i]);
        }

        for(int i = 0; i<n; i++){
            moves += nums[i]-min;
        }
        return moves;
    }
}