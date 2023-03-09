package xb.hou.leetcode.day04;

import xb.hou.leetcode.ITry;

public class Solution {

    /**
     * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        ITry<int[][]> try01 = new Try02();
        try01.execute(
                new int[][]{
                        {1, 2, 5},
                        {3, 2, 1}});
    }
}
