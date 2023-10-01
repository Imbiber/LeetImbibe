class Solution {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        
        for (String word : words){
            StringBuilder rev= new StringBuilder (word).reverse();
            ans.append(rev).append(" ");  
        }
   
        return ans.toString().trim();
        
    }
}