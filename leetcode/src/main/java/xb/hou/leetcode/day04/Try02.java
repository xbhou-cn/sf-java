package xb.hou.leetcode.day04;

import xb.hou.leetcode.ITry;

/**
 * 最基础的dp题，转移方程：
 *
 * <b>f(i, j) = max{f(i - 1, j), f(i, j - 1)} + grid[i][j]</b>
 *
 * @author HZ
 */
public class Try02 implements ITry<int[][]> {
    /**
     * <b>粗暴执行，超时</b>
     *
     * @param grid
     * @return
     */
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        // 定义集合保存上一轮比较结果
        int[] dp = new int[n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j] = Math.max(dp[j], dp[j - 1]) // 相当于比较上一轮的计算的过和本轮计算结果比较取最大值
                        + grid[i - 1][j - 1]; // 将最大结果取得并保存，循环比较
            }
        }

        return dp[n];
    }

    @Override
    public void execute(int[][] grid) {
        System.out.println(maxValue(grid));
    }
}
