package xb.hou.leetcode.day03;

import xb.hou.leetcode.ITry;

import java.util.Map;

/**
 * 官方结题方案。目前看不懂 TODO
 *
 * @author HZ
 */
public class Try04 implements ITry<int[]> {
    Map<Integer, Integer> map;

    public int countTriplets(int[] nums) {
        int MAX_VAL = 1;
        for (int x : nums) {
            while (MAX_VAL <= x) {
                MAX_VAL <<= 1;
            }
        }
        int[] cnt = new int[MAX_VAL];
        MAX_VAL -= 1;
        cnt[0] = nums.length; //0 & any == 0
        for (int m : nums) {
            final int mask = m ^ MAX_VAL;
            for (int s = mask; s > 0; s = (s - 1) & mask) {
                cnt[s] += 1;
            }
        }
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret += cnt[nums[i]];
            for (int j = i + 1; j < nums.length; j++) {
                ret += cnt[nums[i] & nums[j]] << 1;
            }
        }
        return ret;
    }

    @Override
    public void execute(int[] nums) {
        System.out.println(3 & 2 & 1);
        System.out.println(countTriplets(nums));
    }
}
