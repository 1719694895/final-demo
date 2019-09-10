package cz.jfinal.controller;
import cz.jfinal.bean.User;

/**
 * 功能描述：<br>
 *
 * @athor:chenzhen
 * @date:2019/9/620:38
 */
public class SonController extends BaseController {

    public void index(){
        get(1);
        renderText("hello world 123311");
    }

    public void getUserModel(){
        User user=getBean(User.class);
        System.out.println(user);

        renderText("hello user");
    }
}
