package cz.jfinal.handler;


import com.jfinal.handler.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述：
 *
 * @athor:chenzhen
 * @date:2019/9/822:10
 */
public class MyHandler extends Handler {

    public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
        System.out.println("hello-handler");

        next.handle(target, request, response, isHandled);
    }
}
