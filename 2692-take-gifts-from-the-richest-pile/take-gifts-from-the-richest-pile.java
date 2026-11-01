class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long sum = 0;

        for (int i = 0; i < gifts.length; i++) {
            pq.add(gifts[i]);
            sum += gifts[i];
        }

        for (int i = 0; i < k; i++) {
            int x = pq.poll();
            int y = (int) Math.sqrt(x);

            sum = sum - x + y;
            pq.add(y);
        }

        return sum;
    }
}