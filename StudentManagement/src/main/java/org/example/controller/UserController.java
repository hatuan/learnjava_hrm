package org.example.controller;

import org.example.bean.User;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public ModelAndView checkLogin(@ModelAttribute("login") User user)
    {
        User userData = userService.checkLogin(user);
        if(userData != null) {
            return new ModelAndView("index", "userName", userData.getUserName());
        } else {
            return new ModelAndView("login", "message", "Login Fail");
        }
    }
}
