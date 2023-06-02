class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        int a ,b;
        while(l<r){
            a=numbers[l];
            b=numbers[r];
            if(a+b==target)break;
            if(a+b<target){
                l++;
                continue;
            }
            r--;
        
        }
        return new int[]{l+1 , r+1};
        
    }
}