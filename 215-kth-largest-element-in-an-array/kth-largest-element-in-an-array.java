class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++){

            pq.add(nums[i]);

            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}

/*class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}*/




////// HAVE TO DO THIS AGAIN WITH THE QUICKSLECT METHOD