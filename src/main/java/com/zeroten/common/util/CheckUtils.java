package com.zeroten.common.util;

public class CheckUtils {
    // String... strings 为可变参数，你可以认为它是 String[] strings。strings strings 中有任意⼀个字符串为空，则返回 false，否则返回 true。
    public static boolean isAnyEmpty(String... strings) {
        for (String string : strings) {
            if (string == null || "".equals(string)) {
                return false;
            }
        }
        return true;
    }

    // 判断引⽤类型数组是否为空，为空或 null 则返回 true，否则返回 false
    public static boolean isEmpty(Object[] arr) {
        if (arr.length > 0) {
            for (Object o : arr) {
                if (o != null && !"".equals(o)) {
                    return false;
                }
            }
        }
        return true;
    }

    //判断 str1 字符串是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回 false。
    public static boolean equals(String str1, String str2) {
        if (str1 != null && str2 != null && str1.equals(str2)) {
            return true;
        }
        return false;
    }

    //判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。当其中⼀个是 null 时返回 false。
    public static boolean equals(Integer n1, Integer n2) {
        if (n1 != null && n2 != null && n1 == n2) {
            return true;
        }
        return false;
    }
}
