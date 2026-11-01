class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            if (amount[i] > 0) {
                pq.add(amount[i]);
            }
        }

        int sec = 0;

        while (pq.size() > 1) {
            int x = pq.poll();
            int y = pq.poll();
            x--;
            y--;
            if (x > 0) {
                pq.add(x);
            }
            if (y > 0) {
                pq.add(y);
            }
            sec++;
        }

        if (!pq.isEmpty()) {
            sec += pq.peek();
        }
        return sec;
    }
}