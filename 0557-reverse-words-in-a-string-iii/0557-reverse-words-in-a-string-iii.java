class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        
        for (String word : words){
            StringBuilder revWord = new StringBuilder();
            int len = word.length();

            for(int i=len-1;i>=0;i--){
              revWord=revWord.append(word.charAt(i));
            }
          ans.append(revWord).append(" ");
        }
   
        return ans.toString().trim();
        
    }
}