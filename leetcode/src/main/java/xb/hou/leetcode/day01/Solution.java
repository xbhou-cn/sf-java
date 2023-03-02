package xb.hou.leetcode.day01;

public class Solution {
    /**
     * 二进制数转字符串。给定一个介于0和1之间的实数（如0.72），类型为double，打印它的二进制表达式。如果该数字无法精确地用32位以内的二进制表示，则打印“ERROR”。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/bianry-number-to-string-lcci
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(printBin(0.625));
    }

    /**
     * 优化
     * 乘2取整，顺序排列
     * 直到积中的小数部分为零，此时0或1为二进制的最后一位。或者达到所要求的精度为止
     *
     * @param num
     * @return
     */
    public static String printBin(double num) {
        StringBuilder rs = new StringBuilder("0.");
        while (rs.length() <= 31) {
            num *= 2;
            if (num >= 1) {
                rs.append("1");
                num -= 1;
            } else {
                rs.append("0");
            }
            if (num == 0) {
                return rs.toString();
            }
        }
        return "ERROR";
    }

    /**
     * 乘2取整，顺序排列
     * 直到积中的小数部分为零，此时0或1为二进制的最后一位。或者达到所要求的精度为止
     *
     * @param num
     * @return
     */
    public static String printBin1(double num) {
        StringBuilder rs = new StringBuilder("0.");
        while (num != 0) {
            if (rs.length() > 31) {
                return "ERROR";
            }
            // 乘2
            num = num * 2;
            // 取整，顺序排列
            int inter;
            rs.append(inter = (int) num);
            // 重新赋值
            num = num - inter;
        }
        return rs.toString();
    }
}
