package com.gesoft.config;

import com.gesoft.Interceptor.TraceLoggingInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by WCL on 2017/11/2.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // <mvc:interceptors>
//        registry.addInterceptor(new TraceLoggingInterceptor())
//                .addPathPatterns("/**/*.do")
//                .addPathPatterns("/**/*.json");
        registry.addInterceptor(new TraceLoggingInterceptor()).addPathPatterns("/**");
    }
}