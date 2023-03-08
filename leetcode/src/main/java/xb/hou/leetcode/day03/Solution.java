package xb.hou.leetcode.day03;

import xb.hou.leetcode.ITry;

public class Solution {

    /**
     * 给你一个整数数组 nums ，返回其中 按位与三元组 的数目。
     * <p>
     * 按位与三元组 是由下标 (i, j, k) 组成的三元组，并满足下述全部条件：
     * <p>
     * 0 <= i < nums.length
     * 0 <= j < nums.length
     * 0 <= k < nums.length
     * nums[i] & nums[j] & nums[k] == 0 ，其中 & 表示按位与运算符。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/triples-with-bitwise-and-equal-to-zero
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        ITry<int[]> try01 = new Try03();
        try01.execute(new int[]{4, 1, 0});
    }
}
