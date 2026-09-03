class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        while(i<n-3) {
            if(i>0 && nums[i]==nums[i-1]) {
                i++;
                continue;
            }
            int j=i+1;
            while(j<n-2) {
                if(j>i+1 && nums[j]==nums[j-1]) {
                    j++;
                    continue;
                }
                int left=j+1;
                int right=n-1;
                while(left<right) {
                    long sum=(long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target) {
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right && nums[left]==nums[left+1]) {
                            left++;
                        }
                        while(left<right && nums[right]==nums[right-1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }else if(sum<target){
                        left++;
                    }else {
                        right--;
                    }
                }
                j++;
            }
            i++;
        }
        return ans;
    }
}