package Hot008;

public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        StringBuffer string = new StringBuffer();

        //先第一次遍历，构造出全是数字的字符串！
        for(int i = 0 ; i < str.length();i++){
            if(i == 0){ //第一位特判
                if(str.charAt(i) == '+' || str.charAt(i) == '-' ||  (str.charAt(i) >='0' && str.charAt(i) <='9')){
                    string.append(str.charAt(i));
                }else break;;
            }else if((str.charAt(i) >='0' && str.charAt(i) <='9')) string.append(str.charAt(i));
        }

        if (string.length() == 0) return 0;

        //转数字
        int result = 0;
        int flag = 0;
        if(string.charAt(0) == '+' || (string.charAt(0) >'0' && string.charAt(0) <='9') ) flag = 1;

        for(int i =  0; i <string.length();i++){
            if(i == 0 )if(string.charAt(0) == '+' ||string.charAt(0) == '-' ) continue;
            int c = string.charAt(i)-'0';
            if(flag == 1){
                if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && c> 7))
                    return Integer.MAX_VALUE;
            }else {
                if (result > Math.abs(Integer.MIN_VALUE / 10) || (-result == Integer.MIN_VALUE / 10 && c > 8))
                    return Integer.MIN_VALUE;
            }
            result = result*10+ c;
        }
        return flag == 1 ? result : -result;
    }
}
