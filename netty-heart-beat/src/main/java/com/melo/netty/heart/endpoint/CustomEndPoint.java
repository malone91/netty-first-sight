package com.melo.netty.heart.endpoint;

import com.melo.netty.heart.util.NettySocketHolder;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;

import java.util.Map;

/**
 * 自定义端点监控
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
public class CustomEndPoint extends AbstractEndpoint<Map<Long, NioSocketChannel>> {

    /**
     * 监控端点的访问地址
     * @param id
     */
    public CustomEndPoint(String id) {
        //表示不是敏感端点
        super(id, false);
    }

    @Override
    public Map<Long, NioSocketChannel> invoke() {
        return NettySocketHolder.getMap();
    }
}
