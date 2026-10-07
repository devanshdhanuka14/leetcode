class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for (int x : nums) {

            if (x == max || x == smax || x == tmax) {
                continue;
            }

            if (x > max) {
                tmax = smax;
                smax = max;
                max = x;
            }
            else if (x > smax) {
                tmax = smax;
                smax = x;
            }
            else if (x > tmax) {
                tmax = x;
            }
        }

        if (tmax == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) tmax;
    }
}