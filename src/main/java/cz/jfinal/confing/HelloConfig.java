package cz.jfinal.confing;

import com.jfinal.config.*;
import com.jfinal.template.Engine;
import cz.jfinal.controller.IndexController;

/**
 * 功能描述：jfinal 配置器
 *
 * @athor:chenzhen
 * @date:2019/9/620:44
 */
public class HelloConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants constants) {

    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello", IndexController.class);
    }

    @Override
    public void configEngine(Engine engine) {

    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
