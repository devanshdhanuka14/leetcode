class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        int max = 0;
        int count = 0;
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i = 1; i<101; i++){
            if(freq[i]>max){
                max=freq[i];
                count = 0;
            }
            if(freq[i]==max){
                count++;
            }
        }
        if(count>0){
            ans = max*count;
        }
        else{
            ans = max;
        }
        return ans;
    }
}