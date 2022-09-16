package com.duwf.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(HelloConfig.class);
        HelloSpring bean = applicationContext.getBean(HelloSpring.class);
        bean.hello();
    }
}
