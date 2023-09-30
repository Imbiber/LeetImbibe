class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        Stack<int[]> stk = new Stack<>();//int,prev min
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() &&  nums[i]>=stk.peek()[0]){
                stk.pop();
            }
            if(!stk.isEmpty() && nums[i]>stk.peek()[1]){
                return true;
            }
            stk.push(new int[] {nums[i],min});
            min=Math.min(min, nums[i]);
        }
        return false;
    }
}