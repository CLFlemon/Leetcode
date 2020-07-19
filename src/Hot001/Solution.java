package Hot001;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            hashMap.put(nums[i],i);   //注意 我们要通过hashMap的get(key)得到坐标i 注意不要弄反了
        }

        for(int i = 0;i<nums.length;i++){
            int temp = target - nums[i]; //目标数
            if(hashMap.containsKey(temp) && hashMap.get(temp) != i){ //存在 保存结果
                result[0] = i;
                result[1] = hashMap.get(temp);

            }
        }
        return result;
    }
}
