package com.offcn.controller;

import com.offcn.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeThymeleafController {

    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index3.html
     * @param model
     * @return
     */
    @GetMapping("/three")
    public String indexPage(Model model) {
        List<User> list=new ArrayList<User>();
        User u1 = new User(1,"东方海阁",12);
        User u2 = new User(2,"西门小天",13);
        User u3 = new User(3,"南宫成",14);
        User u4 = new User(4,"北冥雪地",15);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        model.addAttribute("userList", list);
        return "index3";
    }
}