class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];

        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
       PriorityQueue<Integer> minHeap = 
       new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for(int n:map.keySet()){
            minHeap.add(n);
            if(minHeap.size()>k)minHeap.remove();
        }

        int i=k-1;
        while(!minHeap.isEmpty()){
            arr[i] = minHeap.remove();
            i--;
        }
        return arr;
    }
}