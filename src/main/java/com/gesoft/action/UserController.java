package com.gesoft.action;

import com.gesoft.domain.User;
import com.gesoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ClassName: UserController <br/>
 * Function: <br/>
 *
 * @author gary.liu
 * @date 2017/5/30
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getUser(Model model, @PathVariable("id") Long id) {
        /*User user = new User();
        user.setId(id);
        user.setName("liu");
        user.setAge(20);*/
        User user = userService.getUserById(id);
        user.setAge(222);
        model.addAttribute("user", user);
        return "user";
    }

}
