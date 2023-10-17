class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> threeSum = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum= nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    threeSum.add(list);
                    j++;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return new ArrayList<>(threeSum);
    }
}