package com.gesoft.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by WCL on 2017/10/31.
 */
@Controller
@RequestMapping("/countries")
public class HelloController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("/")
    public String index() {

        // Log a simple message
        log.debug("debug level log");
        log.info("info level log");
        log.warn("warn level log");
        log.error("error level log");

        return "Hello world from Spring Boot!";
    }

    @RequestMapping(value = "/add")
    public ModelAndView getAll() {
        ModelAndView result = new ModelAndView("index");
        return result;
    }
}
