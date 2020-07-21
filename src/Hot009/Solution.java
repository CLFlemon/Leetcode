package Hot009;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int result = 0;
        int temp = 0;
        while(x != 0){
            temp = x%10;
            result = result*10+temp;
            x = x/10;
        }
        return x == result;
    }
}
