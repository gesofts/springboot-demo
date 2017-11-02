package com.gesoft.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by WCL on 2017/11/1.
 */
@Component
@Order(2)
public class Runner3 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Runner3 run()");
    }
}