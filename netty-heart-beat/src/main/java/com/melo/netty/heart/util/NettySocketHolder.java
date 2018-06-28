package com.melo.netty.heart.util;

import io.netty.channel.socket.nio.NioSocketChannel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Ablert
 * on 2018/6/28.
 * @author Ablert
 */
public class NettySocketHolder {

    private static final Map<Long, NioSocketChannel> MAP = new ConcurrentHashMap<Long, NioSocketChannel>();

    public static void put(Long id, NioSocketChannel nioSocketChannel) {
        MAP.put(id, nioSocketChannel);
    }

    public static NioSocketChannel get(Long id) {
        return MAP.get(id);
    }

    public static Map<Long, NioSocketChannel> getMap() {
        return MAP;
    }

    /**
     * 移除，lambda表达式，entrySet.stream()
     * @param nioSocketChannel
     */
    public static void remove(NioSocketChannel nioSocketChannel) {
        MAP.entrySet().stream().filter(entry -> entry.getValue() == nioSocketChannel).forEach(entry -> MAP.remove(entry.getKey()));
    }
}
