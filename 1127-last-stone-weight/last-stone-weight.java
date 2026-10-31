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
            y = pq.poll();
            x = pq.poll();
            if(x==y){
                continue;
            }
            else if(x!=y){
                pq.add(y-x);
            }
        }

        if(pq.isEmpty()){
            return 0;
        }
    
        return pq.peek();
    }
}