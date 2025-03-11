class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set = new  HashSet<>();
            for(int j=i;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    ans = Math.max(ans, (j)-i+1);
                }
                else{
                    ans = Math.max(ans, (j-1)-i+1);
                    break;
                }
            }
        }
        return ans;
    }
}