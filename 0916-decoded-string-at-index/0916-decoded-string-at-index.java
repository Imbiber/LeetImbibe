class Solution {
    public String decodeAtIndex(String s, int k) {
        int n =  s.length();
        long[] map = new long[n];
        map[0]=1;
        int i =1;
        while(map[i-1]<k){
            if (Character.isDigit(s.charAt(i))){
                map[i]=(s.charAt(i)-'0') * map[i-1];
            }else{
                map[i]=map[i-1]+1;
            }
            ++i;
        }
        --i;
        while(map[i]>k){
            --i;
            if (map[i]<k){
                k =(int) ((k-1)%map[i])+1;
            }
        }
        
        while(Character.isDigit(s.charAt(i)))
           --i;
       
        return s.substring(i, i+1);
    }
}