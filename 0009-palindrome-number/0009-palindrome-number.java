class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert to String
        int n = s.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // We check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        // if no flaws are found we return true
        return true;
    }
}

//below code doesnt work for negative number so find the reason
// //count the digits for length of array
//         int numDigits = (int) Math.log10(x) + 1;

//         int[] digits = new int[numDigits];
//         for (int i = numDigits - 1; i >= 0; i--) {
//         digits[i] = x % 10;
//         x /= 10;
//         }
//         int n=digits.length;
//         for(int i=0;i<n;i++){
//             if (digits[i]!=digits[(n-1-i)]){
//                 return false;
//             }           
//         }
//         return true;
