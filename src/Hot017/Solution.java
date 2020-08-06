package Hot017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {


    List<String> ans = new ArrayList<>();
    public String map(char dig){
        switch (dig)
        {
            case '1' : return "";
            case '2' : return "abc";
            case '3' : return "def";
            case '4' : return "ghi";
            case '5' : return "jkl";
            case '6' : return "mno";
            case '7' : return "pqrs";
            case '8' : return "tuv";
            case '9' : return "wxyz";
            default: return "";
        }
    }
    public List<String> letterCombinations(String digits) {


        int len = digits.length();
        String old = new String();
        getAns(digits,0,len,old);
        return ans;

    }

    private void getAns(String digits, int i, int len,String old) {

        if(i == len ){
            ans.add(old.toString());
            return ;
        }


        String string = map(digits.charAt(i));

        for(int pos = 0; pos < string.length();pos++){

            getAns(digits,i+1,len,old+string.charAt(pos));

        }
    }
}
