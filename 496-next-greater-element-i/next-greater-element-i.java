
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {

            while (!st.isEmpty() && st.peek() < nums2[i]) {
                map.put(st.pop(), nums2[i]);
            }

            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}
/*
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];

        for(int i = 0; i<nums1.length; i++){
            int position = 0;
            for(int j = 0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    position = j;
                }
            }
            answer[i] = -1;
            for(int j = position + 1; j<nums2.length; j++){
                if(nums2[j]>nums1[i]){
                    answer[i] = nums2[j];
                    break;
                }
            }
        }
        return answer;
    }
}
*/