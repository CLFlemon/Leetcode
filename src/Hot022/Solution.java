package Hot022;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<String>();

        dfs(result,n,n,"");
        return result;
    }

    public void dfs(List<String> result , int left, int right, String curr){
        if(left == 0 && right == 0){
            result.add(curr);
            return ;
        }

        if(left > right) return;

        if(left > 0) dfs(result,left-1,right,curr+"(");
        if(right > 0)  dfs(result,left,right-1,curr+")");
    }
}
