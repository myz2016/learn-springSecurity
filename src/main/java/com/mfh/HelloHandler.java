package com.mfh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mfh
 * @date 2020/2/22 10:55
 */
@Controller
public class HelloHandler {
    @RequestMapping("/helloSpringMvc")
    public String hello() {
        return "hello-springmvc";
    }
}
