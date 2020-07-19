package Hot003;

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int ans = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(int left = 0,right = 0; right<length;right++){
            char temp = s.charAt(right);
            if(hashMap.containsKey(temp)){ //重复
                left = Math.max(hashMap.get(temp),left);
            }
            ans = Math.max(ans,right-left+1);
            hashMap.put(temp,right+1);
        }
        return ans;
    }
}
