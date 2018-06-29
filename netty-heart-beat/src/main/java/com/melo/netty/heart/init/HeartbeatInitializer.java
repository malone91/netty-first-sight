package com.melo.netty.heart.init;

import com.melo.netty.heart.decoder.HeartbeatDecoder;
import com.melo.netty.heart.handler.HeartbeatSimpleHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.timeout.IdleStateHandler;
import org.springframework.stereotype.Component;

/**
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
@Component
public class HeartbeatInitializer extends ChannelInitializer<Channel> {

    @Override
    protected void initChannel(Channel channel) throws Exception {
        channel.pipeline()
        //五秒没有收到消息 将IdleStateHandler 添加到 ChannelPipeline 中
        .addLast(new IdleStateHandler(5, 0, 0))
                .addLast(new HeartbeatDecoder())
                .addLast(new HeartbeatSimpleHandler());
    }
}
