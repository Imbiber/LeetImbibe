class Solution {
    public String thousandSeparator(int n) {
        String num = String.valueOf(n);
        StringBuilder newNum = new StringBuilder();
        for(int i=0;i<num.length();i++){
            if( i!=0 && (num.length()-i)%3==0){
                newNum.append(".");
            }
            newNum.append(num.charAt(i));
        }
        return newNum.toString();
    }
}