package com.logbook.common;

import lombok.Getter;

@Getter
public class RequestContext {
   private static final ThreadLocal<RequestContext> threadLocal = new ThreadLocal();

   private final Integer uid;

    public RequestContext(Integer uid) {
        this.uid = uid;
    }

    public static RequestContext getInstance(){
        return threadLocal.get();
    }

    public static void clean(){
        threadLocal.remove();;
    }
    public void setContext(RequestContext context){
        threadLocal.set(context);
    }
}
