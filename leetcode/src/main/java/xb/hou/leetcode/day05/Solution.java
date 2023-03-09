package xb.hou.leetcode.day05;

/**
 * 给你一个长度为 n 下标从 0 开始的字符串 blocks ，blocks[i] 要么是 'W' 要么是 'B' ，表示第 i 块的颜色。字符 'W' 和 'B' 分别表示白色和黑色。
 * <p>
 * 给你一个整数 k ，表示想要 连续 黑色块的数目。
 * <p>
 * 每一次操作中，你可以选择一个白色块将它 涂成 黑色块。
 * <p>
 * 请你返回至少出现 一次 连续 k 个黑色块的 最少 操作次数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/minimum-recolors-to-get-k-consecutive-black-blocks
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author HZ
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
    }

    /**
     * 官方推荐滑块判断
     *
     * @param blocks
     * @param k
     * @return
     */
    public static int minimumRecolors(String blocks, int k) {
        char[] chars = blocks.toCharArray();
        int MIN_CHANGE = k, change = 0;
        for (int i = 0; i <= chars.length - k; i++) {
            // 获取固定滑块内白色的数量
            if (i == 0) {
                for (int j = 0; j < k; j++)
                    if (chars[j] == 'W') change++;
            } else {
                if (chars[i - 1] == 'W') change--;
                if (chars[i + k - 1] == 'W') change++;
            }
            MIN_CHANGE = Math.min(change, MIN_CHANGE);
        }
        return MIN_CHANGE;
    }

    /**
     * 我的思路
     *
     * @param blocks
     * @param k
     * @return
     */
    public static int minimumRecolors1(String blocks, int k) {
        int MIN_CHANGE = blocks.length();
        for (int i = 0; i < blocks.length() - k + 1; i++) {
            int change = 0;
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    change++;
                }
            }
            MIN_CHANGE = Math.min(change, MIN_CHANGE);
        }
        return MIN_CHANGE;
    }
}
