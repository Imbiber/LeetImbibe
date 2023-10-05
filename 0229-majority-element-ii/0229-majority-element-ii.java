class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int ceiling = (int) Math.ceil(nums.length / 3);
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        for (int num : count.keySet()){
            if(count.get(num) > ceiling){
                ans.add(num);
            }
        }
        
        return ans;
    }
}
