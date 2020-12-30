package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class FenZhiController {
    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index7.html
     * @param model
     * @return
     */
    @GetMapping("/fengzhi")
    public String indexPage(Model model) {
        //这是分支特有的方法
        return "this is a fengzhi";
    }
}