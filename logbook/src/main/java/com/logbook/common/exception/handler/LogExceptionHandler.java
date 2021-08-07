package com.logbook.common.exception.handler;

import com.logbook.common.Response;
import com.logbook.common.exception.RequestException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

public class LogExceptionHandler {

    @ExceptionHandler(value = RequestException.class)
    public Response requestExceptionHandler(RequestException e, HttpServletRequest request){
        return Response.ofFailure(e.getErrorCode(),e.getMessage());
    }
}
