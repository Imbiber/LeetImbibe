class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        for(char ch : s.toCharArray()){
            if(ch=='#'){
                if(!s1.isEmpty())
                s1.pop();
                continue;
            }
            s1.push(ch);
        }
        for(char ch : t.toCharArray()){
            if(ch=='#'){
                if(!s2.isEmpty())
                s2.pop();
                continue;
            }
            s2.push(ch);
        }
        String result1="";
        String result2="";
        while(!s1.isEmpty()){
            result1 += s1.pop();
        }
        while(!s2.isEmpty()){
            result2 += s2.pop();
        }
        return result1.equals(result2);
    }
}