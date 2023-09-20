class Solution {
    public int minOperations(int[] nums, int x) {
        int target=-x;
        for(int i : nums) target += i;
        if(target==0) return nums.length;
        if(target<0) return -1;

        int ans = -1, sum=0, left=0;
        for(int right=0;right<nums.length;right++){
            sum += nums[right]; 
            while(sum > target){
                sum -= nums[left++];
            }
            if(sum == target){
                ans = Math.max(ans , right-left+1);
            }
        }
        return ans == -1 ? -1 : nums.length - ans;
    }
}