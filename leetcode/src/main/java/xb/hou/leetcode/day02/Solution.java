package xb.hou.leetcode.day02;

import xb.hou.leetcode.ITry;

public class Solution {
    /**
     * 给你一个长度为 n 的字符串数组 names 。你将会在文件系统中创建 n 个文件夹：在第 i 分钟，新建名为 names[i] 的文件夹。
     * <p>
     * 由于两个文件 不能 共享相同的文件名，因此如果新建文件夹使用的文件名已经被占用，系统会以 (k) 的形式为新文件夹的文件名添加后缀，其中 k 是能保证文件名唯一的 最小正整数 。
     * <p>
     * 返回长度为 n 的字符串数组，其中 ans[i] 是创建第 i 个文件夹时系统分配给该文件夹的实际名称。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/making-file-names-unique
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */

    public static void main(String[] args) {
        // LeetCode执行超时 但是程序执行结果正确
//        ITry<String[]> try01 = new Try01();
        // LeetCode执行超时 但是程序执行结果正确
        ITry<String[]> try02 = new Try02();
        try02.execute(new String[]{"kaido","kaido(1)","kaido","kaido(1)","kaido(2)"});
    }
}
