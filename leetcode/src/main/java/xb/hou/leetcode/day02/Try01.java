package xb.hou.leetcode.day02;

import xb.hou.leetcode.ITry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Try01 implements ITry<String[]> {
    @Override
    public void execute(String[] names) {
        System.out.println(Arrays.toString(getFolderNames(names)));
    }

    public String[] getFolderNames(String[] names) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < names.length; i++) {
            names[i] = callback(set, names[i], names[i], 0);
        }
        return names;
    }

    private String callback(Set<String> set, String originalName, String tmpName, int i) {
        if (set.contains(tmpName)) {
            i++;
            tmpName = originalName + "(" + i + ")";
            return callback(set, originalName, tmpName, i);
        }
        set.add(tmpName);
        return tmpName;
    }
}
