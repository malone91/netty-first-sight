package com.melo.netty.heart.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by Ablert
 * on 2018/6/28.
 * @author Ablert
 */
@Component
public final class SpringBeanFactory implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    private static <T> T getBean(Class<T> c) {
        return applicationContext.getBean(c);
    }

    private static <T> T getBean(String name, Class<T> c) {
        return applicationContext.getBean(name, c);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext = applicationContext;
    }
}
