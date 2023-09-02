class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;

        while(left<=right){
           int count=count1(left);
           if(isPrime(count)==true){
               ans++;
           }
           left++;

        }
        return ans;
        }
        
        public int count1(int num){
            int ans=0;
            while(num!=0){
                int rem=num%2;
                if(rem==1){
                    ans++;
                }
                num=num/2;
            }
            return ans;

        }

        public boolean isPrime(int num) {
             if (num <= 1) {
             return false;
            }
    
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                return false;
                }
            }
    
            return true;
        }
       
    }
