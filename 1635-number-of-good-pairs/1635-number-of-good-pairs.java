class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int[] count = new int[101];
        for(int i : nums){
            ans = ans + count[i];
            count[i]++;
        }
        return ans;
        
    }
}