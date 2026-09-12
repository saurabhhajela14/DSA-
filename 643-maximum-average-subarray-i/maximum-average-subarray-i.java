class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum=0;
       int i=0;
       while(i<k) {
        sum+=nums[i];
        i++;
       }
       int maxsum=sum;
       int left=0;
       int right=k;
       while(right<nums.length){
        sum-=nums[left];
        left++;
        sum+=nums[right];
        right++;
        maxsum=Math.max(maxsum,sum);
       }
       return (double) maxsum/k;
    }
}