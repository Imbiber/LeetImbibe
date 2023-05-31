class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length;
        int ans=0;
        for (int i=1;i<n-1;i++){
            ans+=salary[i];
        }
        return (double)ans/(n-2);

        
    }
}