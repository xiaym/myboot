package com.winter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类说明：
 *
 * @author 夏奕敏
 * @create 2017-10-26 10:17
 * @since JDK 1.8.91 (64 bit)
 */
@Controller
public class helloController {


    @RequestMapping("/test")
    public String test(){
        return "index";
    }
}