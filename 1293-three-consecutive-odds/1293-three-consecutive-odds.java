class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3){
            return false;
        }
        if(arr.length==3){
            if(arr[0]%2 != 0 && arr[1]%2 != 0 && arr[2]%2 !=0)
            return true;
            else 
            return false;

        }
        for(int i=0 ; i<=arr.length-3;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
            return true;
        }
        return false;
        
    }
}