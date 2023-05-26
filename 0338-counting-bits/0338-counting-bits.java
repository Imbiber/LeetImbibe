class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n + 1];

        for (int i=0;i<=n;i++) {
            res[i]=count(i);
        }
        return res;
    }

    private int count(int a) {
        int count=0;
        while (a!=0) {
        a&=a-1;
        count++;
        }
        return count;
    }
}