class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int sum=0; // because sum would be even for digits with both all even digits and all odd digits
            int currentNo=i;
            while(currentNo!=0){
                sum += currentNo%10;
                currentNo /=10;
            }
            if(sum%2==0){
                count++;
            }
        }
        return count;
    }
}