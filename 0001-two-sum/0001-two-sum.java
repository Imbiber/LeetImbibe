class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ob=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int diff=target-a;
            if(ob.containsKey(diff)){
                return new int[]{ob.get(diff),i};
            }
            ob.put(a,i);
        }
        return new int[]{};
    }

}