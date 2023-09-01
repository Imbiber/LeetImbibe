class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=count(i);
        }
        return arr;
    }
    public int count(int a){
        int n=0;
        while(a!=0){
            a&=a-1;
            n++;
        }
        return n;
    }
}