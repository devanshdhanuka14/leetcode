class Solution {
    public int minSubarray(int[] nums, int p) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        long total = 0;
        for(int i = 0; i<nums.length; i++){
            total += nums[i];
        }

        int target = (int)((total+p)%p);

        if(target==0){
            return 0;
        }

        long sum = 0;
        int min = nums.length;

        for(int i = 0; i<nums.length; i++){
            sum += nums[i];

            int rem = (int)((sum+p)%p);

            int needed = (rem - target + p) % p;

            if(map.containsKey(needed)){
                min = Math.min(min, i - map.get(needed));
            }

            // store latest index as we want the shortest subarray
            map.put(rem, i);
        }

        if(min == nums.length){
            return -1;
        }

        return min;
    }
}