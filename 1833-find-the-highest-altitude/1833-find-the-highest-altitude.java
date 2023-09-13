class Solution {
    public int largestAltitude(int[] gain) {
        int max=Integer.MIN_VALUE;
        int[] alt = new int[gain.length+1];
        alt[0]=0;
        for(int i=1;i<alt.length;i++){
            alt[i]=gain[i-1]+alt[i-1];
        }
        for(int i=0;i<alt.length;i++){
            if(alt[i]>max){
                max=alt[i];
            }
        }
        return max;
    }
}