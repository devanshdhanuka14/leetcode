class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        long count1 = 0;
        long count2 = 0;
        long msum1 = 0;
        long msum2 = 0;

        for(int i = 0; i<nums1.length; i++){
            sum1 += nums1[i];
            if(nums1[i]==0){
                count1++;
            }
        }
        msum1 = sum1 + count1;

        for(int i = 0; i<nums2.length; i++){
            sum2 += nums2[i];
            if(nums2[i]==0){
                count2++;
            }
        }
        msum2 = sum2 + count2;
        
        if(msum1 == msum2){
            return msum1;
        }
        if(msum1<msum2){
            if(count1>0){
                return msum2;
            }
        }
        else{
            if(count2>0){
                return msum1;
            }
        }
        return -1;
    }
}