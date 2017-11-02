package com.gesoft.utils;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by WCL on 2017/11/1.
 */
@Component
public class StartUpInit {
    @PostConstruct
    public void init(){
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
    }
}
