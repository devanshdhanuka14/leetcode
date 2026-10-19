class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int n = arr.length;
        int[] nums = new int[2*n];
        long sum = 0;
        long maxsum = 0;
        long curr = 0;
        long MOD = 1000000007L;

        for(int i = 0; i<n; i++){
            sum += arr[i];
        }

        if(k == 1){
            for(int i = 0; i<n; i++){
                curr = Math.max(0, curr + arr[i]);
                maxsum = Math.max(curr, maxsum);
            }
            return (int)(maxsum % MOD);
        }

        for(int i = 0; i<n; i++){
            nums[i] = arr[i];
            nums[i+n] = arr[i];
        }

        for(int i = 0; i<2*n; i++){
            curr = Math.max(0, curr + nums[i]);
            maxsum = Math.max(curr, maxsum);
        }

        if(k > 2 && sum > 0){
            maxsum += (long)(k-2) * sum;
        }

        return (int)(maxsum % MOD);
    }
}