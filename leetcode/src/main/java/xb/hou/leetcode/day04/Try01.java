package xb.hou.leetcode.day04;

import xb.hou.leetcode.ITry;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author HZ
 */
public class Try01 implements ITry<int[][]> {
    /**
     * <b>粗暴执行，超时</b>
     *
     * @param grid
     * @return
     */
    public int maxValue(int[][] grid) {
        Node node = new Node(grid[0][0]);
        int i = 0, j = 0;
        callback(grid, node, i, j);
        return node.maxNext();
    }

    private void callback(int[][] grid, Node node, int i, int j) {
        if (i < grid.length - 1 || j < grid[i].length - 1) {
            List<Node> next = new ArrayList<>();
            node.next = next;
            int nextJ = j == grid[i].length - 1 ? j : j + 1;
            Node right = new Node(grid[i][nextJ]);
            int nextI = i == grid.length - 1 ? i : i + 1;
            Node bottom = new Node(grid[nextI][j]);
            if (j == grid[i].length - 1) {
                next.add(bottom);
                callback(grid, bottom, nextI, j);
            } else if (i == grid.length - 1) {
                next.add(right);
                callback(grid, right, i, nextJ);
            } else {
                next.add(right);
                callback(grid, right, i, nextJ);
                next.add(bottom);
                callback(grid, bottom, nextI, j);
            }
        }
    }

    class Node {
        int value;
        List<Node> next;

        public Node(int value) {
            this.value = value;
        }

        public int maxNext() {
            if (next == null) {
                return value;
            }
            AtomicInteger rs = new AtomicInteger();
            next.forEach(e -> rs.set(Math.max(rs.get(), e.maxNext())));
            return value + rs.get();
        }
    }

    @Override
    public void execute(int[][] grid) {
        System.out.println(maxValue(grid));
    }
}
