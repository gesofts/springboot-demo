package com.gesoft.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WCL on 2017/10/31.
 */
@Controller
public class PageController {

    @RequestMapping("/testTH")
    public String testTH(ModelMap map) {
        map.addAttribute("msg", "Hello, rensanning! @Thymeleaf");
        return "test_th";
    }

    @RequestMapping("/testFM")
    public String testFM(ModelMap map) {
        map.addAttribute("msg", "Hello, rensanning! @FreeMarker");
        return "test_fm";
    }

}