package Hot014;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) return "";

        String s0 = strs[0];

        for(int i = 1 ; i< strs.length;i++){
            int j = 0;
            for(;j< Math.min(s0.length(),strs[i].length());j++){
                if(s0.charAt(j) != strs[i].charAt(j)) break;
            }
            s0 = s0.substring(0,j);
        }
        return s0;
    }

}
