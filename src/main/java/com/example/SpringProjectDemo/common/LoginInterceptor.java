package com.example.SpringProjectDemo.common;

import com.example.SpringProjectDemo.controller.BaseController;
import com.example.SpringProjectDemo.entity.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录拦截类
 */
@Component
public class LoginInterceptor extends BaseController implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException, ServletException {

        logger.info("-------------------开始进行登录拦截-------------------");
        Session session = checkLogin(request);
        if(session == null){
            //未登录，返回码为302，前端进行登录重定向
            response.setStatus(302);
            response.setHeader("redirect","login");

//            response.sendRedirect("http://localhost:8080/#/login");
//            request.getRequestDispatcher("https://www.baidu.com").forward(request, response);
            return false;
        }

        return true;
    }
}
