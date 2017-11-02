package com.gesoft.action;

import com.gesoft.domain.Pivs;
import com.gesoft.service.PivsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by WCL on 2017/11/2.
 */
@RestController
@RequestMapping("/pivs")
public class PivsController {

    @Autowired
    PivsService pivsService;

    @RequestMapping("/get/{id}")
    public Pivs get(Model model, @PathVariable("id") String id)
    {
        return pivsService.findById(id);
    }
    @RequestMapping("/add")
    public String add(@RequestParam Map<String, Object> map)
    {
        return pivsService.addPivs(map.get("pivName").toString(), map.get("pivNo").toString()) + "----";
    }

    @RequestMapping("/del/{id}")
    public String del(@PathVariable("id") String id)
    {
        pivsService.deleteById(id);
        return "ok";
    }

}
