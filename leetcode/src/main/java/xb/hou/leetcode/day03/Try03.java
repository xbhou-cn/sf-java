package xb.hou.leetcode.day03;

import xb.hou.leetcode.ITry;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 通过，但是执行用时和内存消耗都比较大
 * 执行时间：121 ms
 * 内存消耗：44.6 MB
 *
 * @author HZ
 */
public class Try03 implements ITry<int[]> {
    Map<Integer, Integer> map;

    public int countTriplets(int[] nums) {
        map = new HashMap<>();
        for (int i : nums) {
            for (int j : nums) {
                int tmp;
                map.put(tmp = i & j, map.getOrDefault(tmp, 0) + 1);
            }
        }
        int rs = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if (v == null) {
                continue;
            }
            if (k == 0) {
                rs += nums.length * v;
                continue;
            }
            for (int num : nums) {
                if (num == 0 || (k & num) == 0) {
                    rs += v;
                }
            }
        }
        return rs;
    }

    @Override
    public void execute(int[] nums) {
        System.out.println(3 & 2 & 1);
        System.out.println(countTriplets(nums));
    }
}
