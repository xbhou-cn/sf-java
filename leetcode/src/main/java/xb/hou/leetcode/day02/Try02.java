package xb.hou.leetcode.day02;

import xb.hou.leetcode.ITry;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Try02 implements ITry<String[]> {
    /**
     * 保存不重复的数据
     */
    private Map<String, Integer> map;

    public String[] getFolderNames(String[] names) {
        map = new HashMap<>(16);
        for (int i = 0; i < names.length; i++) {
            names[i] = df(names[i]);
        }
        return names;
    }

    private String df(String tmpName) {
        if (!map.containsKey(tmpName)) {
            // 初次保存到map
            map.put(tmpName, 0);
        } else {
            // 获取角标
            int num = map.get(tmpName) + 1;
            // 角标递增
            map.put(tmpName, num);
            // 生成新的目录
            tmpName = tmpName + "(" + num + ")";
            // 判断新的目录是否存在
            while (map.containsKey(tmpName)) {
                // 获取新目录的根目录
                tmpName = tmpName.substring(0, tmpName.lastIndexOf("("));
                // 获取根目录的角标并递增
                num = map.get(tmpName) + 1;
                map.put(tmpName, num);
                // 生成新目录
                tmpName = tmpName + "(" + num + ")";
            }
            // 新目录不重复则保存到map集合
            map.put(tmpName, 0);
        }
        return tmpName;
    }

    @Override
    public void execute(String[] names) {
        System.out.println(Arrays.toString(getFolderNames(names)));
    }
}
