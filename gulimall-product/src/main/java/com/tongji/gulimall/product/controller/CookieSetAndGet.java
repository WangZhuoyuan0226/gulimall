package com.tongji.gulimall.product.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@RestController
public class CookieSetAndGet {

    @RequestMapping("/setCookies")
    public  String setCookies(HttpServletResponse response){
        //HttpServerletRequest 装请求信息类
        //HttpServerletRespionse 装相应信息的类
        Cookie cookie=new Cookie("sessionId","CookieTestInfo");
        response.addCookie(cookie);
        return "添加cookies信息成功";
    }

    @RequestMapping("/getCookies")
    public  String getCookies(HttpServletRequest request){
        //HttpServletRequest 装请求信息类
        //HttpServletRespionse 装相应信息的类
        //   Cookie cookie=new Cookie("sessionId","CookieTestInfo");
        Cookie[] cookies =  request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("sessionId")){
                    return cookie.getValue();
                }
            }
        }

        return  null;
    }

    @RequestMapping("/getSession")
    public  String getSession(HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        Enumeration<String> attributeNames = httpSession.getAttributeNames();
        System.out.println(attributeNames);
        System.out.println(httpSession.getId());
        return  null;
    }

    @RequestMapping("/testSession")
    public  String testSession(HttpServletRequest request, HttpSession httpSession){
        System.out.println(httpSession.getId());
        return  null;
    }
}
