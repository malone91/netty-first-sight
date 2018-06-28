package com.melo.netty.common.util;

/**
 * Created by Ablert
 * on 2018/6/28.
 * @author Ablert
 */
public final class RandomUtil {

    public static int getRandom() {
        double random = Math.random();
        return (int) (random * 100);
    }
}
