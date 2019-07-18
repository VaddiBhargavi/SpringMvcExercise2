package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("info")
    public ModelAndView getForm(@RequestParam("username") String name, @RequestParam("password") String password)
    {
       // User user= new User();
        ModelAndView mv =new ModelAndView();
      //  String submit=
        mv.setViewName("display");
        mv.addObject("result",name);
        return mv;
    }

}
