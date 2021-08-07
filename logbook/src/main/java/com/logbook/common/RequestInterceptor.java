package com.logbook.common;


import com.logbook.constants.CommonConstant;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String userId = request.getHeader(CommonConstant.LOG_BOOK_USER_ID);
        int logBookUserId = Integer.parseInt(userId);
        RequestContext requestContext = new RequestContext(logBookUserId);
        RequestContext.getInstance().setContext(requestContext);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        RequestContext.clean();
    }
}
