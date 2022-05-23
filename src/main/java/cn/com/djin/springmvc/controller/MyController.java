package cn.com.djin.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyController implements Controller {

    //实现接口方法，处理请求
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //新建模型视图层对象
        ModelAndView modelAndView = new ModelAndView();
        //往modelAndView对象中设置数据，可以最终通过modelAndView对象带到页面
        //跟我们之前u2中的web作用域用法一样，其域范围与request作用域范围一样（客户端的一次请求）
        modelAndView.addObject("msg","第一个自定义controller案例");
        //往modelAndView对象中设置跳转的页面路径，可以通过此配置实现页面跳转
        //此时的页面跳转默认为转发
        modelAndView.setViewName("/WEB-INF/jsp/show.jsp");
        return modelAndView;
    }
}
