package cz.jfinal.confing;

import com.jfinal.config.*;
import com.jfinal.template.Engine;
import cz.jfinal.controller.IndexController;
import cz.jfinal.handler.MyHandler;
import cz.jfinal.interceptor.MyInterceptor;
import cz.jfinal.routes.FrontRoutes;

/**
 * 功能描述：jfinal 配置器
 *
 * @athor:chenzhen
 * @date:2019/9/620:44
 */
public class HelloConfig extends JFinalConfig {
    /**
     * 配置jfinal的基本参数
     * @param constants
     */
    @Override
    public void configConstant(Constants constants) {

        constants.setDevMode(true);

    }

    /**
     * 配置路由
     * @param routes
     */
    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello", IndexController.class);
        routes.add(new FrontRoutes()) ;
    }

    /**
     * 配置模板引擎
     * @param engine
     */
    @Override
    public void configEngine(Engine engine) {

    }

    /**
     * 配置插件
     * 数据库和redis等以插件的形式
     * @param plugins
     */
    @Override
    public void configPlugin(Plugins plugins) {

    }

    /**
     * 配置拦截器
     * @param interceptors
     */
    @Override
    public void configInterceptor(Interceptors interceptors) {
        interceptors.add(new MyInterceptor());
    }

    @Override
    public void configHandler(Handlers handlers) {
        handlers.add(new MyHandler());
    }
}
