class Solution {
    public int findSpecialInteger(int[] arr) {

        int maxFrequency = 0;
        int maxElement = Integer.MIN_VALUE; 

        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
            int frequency = map.get(i);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxElement = i;
            }
        }
        return maxElement;
        
    }
}