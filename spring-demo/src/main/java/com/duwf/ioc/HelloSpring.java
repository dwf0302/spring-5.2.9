package com.duwf.ioc;

import org.springframework.stereotype.Repository;

@Repository
public class HelloSpring {

    public void hello(){
        System.out.println("----------------------------");
        System.out.println("Hello-Spring");
        System.out.println("----------------------------");
    }
}
