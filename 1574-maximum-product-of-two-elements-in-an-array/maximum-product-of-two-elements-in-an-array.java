class Solution {
    public int maxProduct(int[] nums) {
        int largest=0;
        int secondLargest=0;
        int i=0;
        while(i<nums.length) {
            if(nums[i]>largest) {
                secondLargest=largest;
                largest=nums[i];
            }else if(nums[i]>secondLargest) {
                secondLargest=nums[i];
            }
            i++;
        }
        return (largest - 1)* (secondLargest - 1);
    }
}