class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26]; 
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;

        Stack<Character> stack = new Stack<>(); 
        boolean[] seen = new boolean[26]; 
        for (int i = 0; i < s.length(); i++) {
            if (seen[s.charAt(i) - 'a']) { 
                freq[s.charAt(i) - 'a']--;
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > s.charAt(i) && 
            freq[stack.peek() - 'a'] > 0) {
                seen[stack.pop() - 'a'] = false; 
            }

            stack.push(s.charAt(i));
            seen[s.charAt(i) - 'a'] = true;
            freq[s.charAt(i) - 'a']--;
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }

}