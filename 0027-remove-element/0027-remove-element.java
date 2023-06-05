class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // to store the count of elements not equal to val

        // Loop through nums and move elements not equal to val to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
