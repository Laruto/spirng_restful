package cn.wc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello2")//过时的方法
public class Hello2Controller {

    @RequestMapping(params = "method=add")
    public String add(){
        System.out.println("add");
        return "redirect:/index.jsp";
    }
    public String upgrate(){
        System.out.println("upgrate");
        return "redirect:/index.jsp";
    }
    public String delete(){
        System.out.println("delete");
        return "redirect:/index.jsp";
    }
}
