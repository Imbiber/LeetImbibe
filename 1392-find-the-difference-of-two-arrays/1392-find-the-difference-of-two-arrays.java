class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> List1 = new ArrayList<>();
        List<Integer> List2 = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int n: nums1) set1.add(n);
        for(int n: nums2) set2.add(n);

        for(int m : nums1){
            if(set2.add(m)){
                List1.add(m);
            }
        }
        for(int m : nums2){
            if(set1.add(m)){
                List2.add(m);
            }
        }

        for(int i : set1){
            if(!set1.contains(i)){
                List1.add(i);
            }  
        }
        for(int i : set2){
            if(!set2.contains(i)){
                List2.add(i);
            }  
        }
        ans.add(List1);
        ans.add(List2);
        return ans;

    }
}