package com.gesoft.action;

import com.gesoft.domain.Todo;
import com.gesoft.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WCL on 2017/10/31.
 */
@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "/get.json", method = RequestMethod.GET)
    public Todo get(@RequestParam(value = "id") String id) {
        return todoService.select(Integer.parseInt(id));
    }

    @RequestMapping(value = "/set.json")
    public Todo set(@RequestParam(value = "title") String title,
                    @RequestParam(value = "details") String details) {
        int id = todoService.insert(title, details);
        return todoService.select(id);
    }
}
