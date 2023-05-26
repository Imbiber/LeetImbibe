class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            int newReversed = reversed * 10 + lastDigit;
            if ((newReversed - lastDigit) / 10 != reversed) {
                // integer overflow is checked
                return 0;
            }
            reversed = newReversed;
            x /= 10;
        }
        return reversed;
    }
}
