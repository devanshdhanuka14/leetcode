class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Iterator<Integer> it = map.keySet().iterator();

        while(it.hasNext()){
            int num = it.next();
            int frequency = map.get(num);

            pq.add(new int[]{num, frequency});
        }

        for(int i = 0; i < k; i++){
            int[] curr = pq.poll();
            answer[i] = curr[0];
        }
        return answer;
    }
}