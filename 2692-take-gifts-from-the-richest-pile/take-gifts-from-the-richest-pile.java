class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long num = 0;

        for(int i = 0; i<gifts.length; i++){
            pq.add(gifts[i]);
        }

        for(int i = 0; i<k; i++){
            int x = pq.poll();
            int y = (int) Math.floor(Math.sqrt(x));
            pq.add(y);
        }

        while(!pq.isEmpty()){
            num += pq.poll();
        }
        return num;
    }
}