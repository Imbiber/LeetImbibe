class Solution {
    public long putMarbles(int[] weights, int k) {
        int n=weights.length;
        int [] pair= new int [n-1];
        for(int i=1;i<n;i++){
            pair[i-1]=weights[i]+ weights[i-1];

        }
        Arrays.sort(pair);
        long min=0;
        long max=0;
        for(int i=0;i<k-1;i++){
            min+=pair[i];
            max+=pair[n-i-2];        
            }
             return max-min;
    }
   
}