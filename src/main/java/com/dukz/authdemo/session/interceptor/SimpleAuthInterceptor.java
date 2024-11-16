package com.dukz.authdemo.session.interceptor;

import com.dukz.authdemo.session.model.UserDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Set;

@Component
public class SimpleAuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object obj = request.getSession().getAttribute(UserDto.USER_SESSION_KEY);
        if(Objects.isNull(obj)){
            writeContent(response, "请登录");
        }
        UserDto user = (UserDto) obj;
        Set<String> authorities = user.getAuthorities();
        String requestURI = request.getRequestURI();
        if(authorities.contains("p1") && StringUtils.contains(requestURI, "/r1")){
            return true;
        }
        if(authorities.contains("p2") && StringUtils.contains(requestURI, "/r2")){
            return true;
        }
        writeContent(response, "没有权限，拒绝访问");
        return false;
    }

    private void writeContent(HttpServletResponse response, String msg) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print(msg);
        writer.close();
        response.resetBuffer();
    }
}
