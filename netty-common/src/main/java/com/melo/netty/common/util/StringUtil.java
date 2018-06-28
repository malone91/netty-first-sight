package com.melo.netty.common.util;

/**
 * Created by Ablert
 * on 2018/6/28.
 * @author Ablert
 */
public final class StringUtil {

    public static boolean isNullOrEmpty(String str) {
        return null == str || 0 == str.trim().length();
    }

    public static boolean isEmpty(String string) {
        return string == null || "".equals(string.trim());
    }

    public static boolean isNotEmpty(String string) {
        return string != null && !"".equals(string.trim());
    }

    public static String formatLike(String string) {
        return isNotEmpty(string) ? "%" + string + "%" : null;
    }
}
