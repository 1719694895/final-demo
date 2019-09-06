package cz.jfinal.controller;
import com.jfinal.core.Controller;

import java.util.List;
/**
 * 功能描述：<br>
 *
 * @athor:chenzhen
 * @date:2019/9/620:38
 */
public class IndexController extends Controller {

    public void index(){
        renderText("hello world 123311");
    }
}
