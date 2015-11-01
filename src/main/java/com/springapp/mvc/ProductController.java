package com.springapp.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by dxkj on 2015/11/1.
 */


@RestController
public class ProductController {

    @RequestMapping("/test")
    public String test() {
        return "ccc";
    }

    @RequestMapping("/test2")
    public String testIP(HttpServletRequest request,HttpServletResponse response) {
        System.out.println(request.getRemoteHost());
        return "ccc";
    }
}