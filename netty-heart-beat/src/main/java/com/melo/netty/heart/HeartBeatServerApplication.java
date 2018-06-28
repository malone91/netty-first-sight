package com.melo.netty.heart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Ablert
 * on 2018/6/28.
 * @author Ablert
 */
@SpringBootApplication
public class HeartBeatServerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(HeartBeatServerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HeartBeatServerApplication.class, args);
        LOGGER.info("start server success");
    }
}
