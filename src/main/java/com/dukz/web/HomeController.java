package com.dukz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 主页控制器
 *
 * @ClassName HomeController
 * @Author dukz
 * @Date 2021/11/9
 * @Version 1.0
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
