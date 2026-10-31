class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = stones.length;
        int x = 0;
        int y = 0;

        for(int i = 0; i<n; i++){
            pq.add(stones[i]);
        }

        while(pq.size()>1){
            int k = pq.size();
            y = pq.poll();
            x = pq.poll();
            if(k==2 && x==y){
                return 0;
            }
            if(x==y){
                continue;
            }
            else if(x!=y){
                pq.add(y-x);
            }
        }
        return pq.peek();
    }
}