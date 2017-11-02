package com.gesoft.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by WCL on 2017/11/1.
 */
@Component
public class GeneralEventHandler {

    private static final Logger logger = LoggerFactory.getLogger(AppStartupRunner.class);

    @EventListener
    public void handleApplicationReady(ApplicationReadyEvent event) {
        logger.info("The application is ready to service requests..");
    }

}