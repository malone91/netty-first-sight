package com.melo.netty.heart.config;

import com.melo.netty.heart.endpoint.CustomEndPoint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ablert
 * on 2018/6/29.
 * @author Ablert
 */
@Configuration
public class EndPointConfigurer {

    @Value("${monitor.channel.map.key}")
    private String channelMap;

    @Bean
    public CustomEndPoint buildEndPoint() {
        CustomEndPoint customEndPoint = new CustomEndPoint(channelMap);
        return customEndPoint;
    }
}
