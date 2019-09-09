package cz.jfinal.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 功能描述： 拦截器
 *
 * @athor:chenzhen
 * @date:2019/9/921:26
 */
public class MyInterceptor implements Interceptor {

    public void intercept(Invocation invocation) {
        System.out.println("MyInterceptor-intercept");
        invocation.invoke();
        System.out.println("end");
    }
}
