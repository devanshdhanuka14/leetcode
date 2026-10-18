class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = 0;
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++){

            int prevNoDelete = noDelete;

            oneDelete = Math.max(prevNoDelete, oneDelete + arr[i]);

            noDelete = Math.max(arr[i], noDelete + arr[i]);

            maxSum = Math.max(maxSum, Math.max(noDelete, oneDelete));
        }

        return maxSum;
    }
}