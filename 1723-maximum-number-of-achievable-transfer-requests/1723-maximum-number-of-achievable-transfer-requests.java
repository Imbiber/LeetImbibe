class Solution {
    int ans = 0;
    int [][] req;
    
    public int maximumRequests(int n, int[][] req) {
        this.req = req;
        int [] transfer = new int[n];
        backTrack(0, 0,transfer);
        return ans;
    }
    
    public void backTrack(int i, int count, int [] transfer){
        if(i == req.length){
            for(int j : transfer){
                if(j!=0) return;
            }
            ans = Math.max(ans,count);
            return;
        }
        
        
        transfer[req[i][0]]--;
        transfer[req[i][1]]++;
        backTrack(i+1, count+1,transfer);
            
        transfer[req[i][0]]++;
        transfer[req[i][1]]--;
        backTrack(i+1, count,transfer);
        
        
    }
}