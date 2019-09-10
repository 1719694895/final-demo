package cz.jfinal.controller;

import com.jfinal.core.Controller;

/**
 * 功能描述：超类
 *
 * @athor:chenzhen
 * @date:2019/9/1021:32
 */
public class BaseController extends Controller {

    public void base(){
        renderText("base......");
    }
}
