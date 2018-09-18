package cn.wc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("uname") String name, ModelMap model){
        model.addAttribute("name",name);
        System.out.println(name);
        return "index.jsp";
    }

    @RequestMapping("/delete/{id}")//可以加多个
    public String hello2(@PathVariable int id){
        System.out.println(id);
        return "/index.jsp";
    }


}
