class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int freq[] = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));

        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
               
        pq.add(new int[]{nums[0],map.get(nums[0])});

        for(int i = 1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                pq.add(new int[]{nums[i],map.get(nums[i])});
            }
        }

        for(int i = 0; i<k; i++){
            int curr[]=pq.poll();
            freq[i]=curr[0];
        }
        return freq;
    }
}