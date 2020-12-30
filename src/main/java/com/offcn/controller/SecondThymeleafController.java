package com.offcn.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.offcn.bean.User;
@Controller
public class SecondThymeleafController {
    /**
     * 访问localhost:8080 页面
     * 将数据message填充到templates/index2.html
     * @param model
     * @return
     */
    @GetMapping("/second")
    public String indexPage(Model model) {
        String message = "this is a temp";
        User user = new User(1,"东方海阁",12);
        Map<String,Object> map=new HashMap<>();
        map.put("src1","3.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("message", message);
        model.addAttribute("user", user);
        model.addAttribute("src", map);
        return "index2";
    }
}