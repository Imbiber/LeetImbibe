class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length();i++){
            int ch=num.charAt(i)-'0'; // to convert into Integer we sub 0 from the charAt (string) here its already integer though. 
            map.put(ch, map.getOrDefault(ch,0)+1);
        }


        for (int i=0;i<num.length();i++){
            int ch=num.charAt(i)-'0';
            if(ch!=map.getOrDefault(i,0))
            return false;
        }
        return true;
        
    }
}