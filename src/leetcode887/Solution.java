package leetcode887;

import java.util.Stack;

public class Solution {

    Integer[][] memory = null;

    public int superEggDrop(int K, int N) {

        this.memory = new Integer[K+1][N+1];

        dp(K,N);

        return memory[N][K];

    }

    private int dp(int k, int n){

        if(k  == 1) return n;
        if(n  == 0 ) return 0;

        if(memory[k][n]!=null)return memory[k][n];

        int tmp = Integer.MAX_VALUE;
        // //第一种 从第1层楼到第n层楼每层楼开始逐个尝试作为切入点 (会超时)
        for(int i=1;i<=n+1;i++){
             //当选择在第i层楼扔了鸡蛋之后 可能出现鸡蛋碎了和鸡蛋没碎两种情况：
             //当鸡蛋碎了 问题状态转嫁为求k-1个鸡蛋 搜索的楼层区间变为1~i-1共i-1层楼时求解
             int eggBreak=dp(k-1,i-1);
             //当鸡蛋没碎 问题状态转嫁为鸡蛋的个数K不变 搜索楼层区间变为i+1~N共N-i层楼时求解
             int eggUnBreak=dp(k,n-i);
             //最终以i层为切入点求解的答案 为两种状态的最坏情况 并加上i层时操作1 并更新最小值
             tmp = Math.min(tmp,Math.max(eggBreak,eggUnBreak)+1);
        }

        memory[k][n]=tmp;


        return tmp;



    }
}
