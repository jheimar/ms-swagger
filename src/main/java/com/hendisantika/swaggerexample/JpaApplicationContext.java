package com.hendisantika.swaggerexample;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/5/17
 * Time: 7:52 AM
 * To change this template use File | Settings | File Templates.
 */

@Component
public class JpaApplicationContext implements ApplicationContextAware{
    private static ApplicationContext CONTEXT;

    public void setApplicationContext(final ApplicationContext context) throws BeansException {
        CONTEXT = context;
    }

    public static <T> T getBean(Class<T> clazz) {
        return CONTEXT.getBean(clazz);
    }
}
