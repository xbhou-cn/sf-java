package xb.hou.leetcode.day03;

import xb.hou.leetcode.ITry;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过，但是执行用时和内存消耗都比较大
 * 执行时间：121 ms
 * 内存消耗：44.6 MB
 * @author HZ
 */
public class Try02 implements ITry<int[]> {
    Map<Integer, Integer> map ;
    public int countTriplets(int[] nums) {
        int rs = 0;
        map = new HashMap<>();
        for (int i : nums) {
            if (i == 0) {
                rs += Math.pow(nums.length, 2);
                continue;
            }
            for (int j : nums) {
                int tmp;
                if (j == 0 || (tmp = i & j) == 0) {
                    rs += nums.length;
                    continue;
                }
                Integer integer;
                if ((integer = map.get(tmp)) == null || integer == 0) {
                    integer = 0;
                    for (int k : nums) {
                        if (k == 0 || (tmp & k) == 0) {
                            integer++;
                        }
                    }
                    map.put(tmp, integer);
                }
                rs += integer;
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
