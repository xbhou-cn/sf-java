package xb.hou.leetcode.day03;

import xb.hou.leetcode.ITry;

/**
 * @author HZ
 */
public class Try01 implements ITry<int[]> {
    /**
     * <b>简单粗暴，直接超时</b>
     *
     * @param nums
     * @return
     */
    public int countTriplets(int[] nums) {
        int rs = 0;
        for (int i : nums) {
            for (int j : nums) {
                for (int k : nums) {
                    if ((i & j & k) == 0) {
                        rs++;
                    }
                }
            }
        }
        return rs;
    }

    @Override
    public void execute(int[] nums) {
        System.out.println(countTriplets(nums));
    }
}
