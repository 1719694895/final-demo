package cz.jfinal;

import com.jfinal.server.undertow.UndertowServer;
import cz.jfinal.confing.HelloConfig;

/**
 * 功能描述：jfinal 启动方法
 *
 * @athor:chenzhen
 * @date:2019/9/620:48
 */
public class startJFinal {
    public static void main(String[] args) {
        UndertowServer.start(HelloConfig.class, 8080, true);
    }
}
