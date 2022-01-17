package com.dukz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 显示专用
 *
 * @ClassName ShowController
 * @Author dukz
 * @Date 2021/11/13
 * @Version 1.0
 */
@Controller
@RequestMapping("/spitter")
public class ShowController {

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    @ResponseBody
    public String showSpitter(@RequestParam("id")long id){
        return String.valueOf(id);
    }

    @RequestMapping(value = "/{spitterUser}", method = RequestMethod.GET)
    @ResponseBody
    public String pathParam(@PathVariable("spitterUser") String user){
        return user;
    }
}
