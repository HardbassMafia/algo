package com.lu.dmsxl.dp;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author sheldon
 * @date 2022-05-30
 */
public class q746MinCostClimbingStairs {

    @Test
    public void test(){
        System.out.println(minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }

}
