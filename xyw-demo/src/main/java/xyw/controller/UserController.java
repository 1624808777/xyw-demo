package xyw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyw.service.UserService;
import xyw.vo.User;

@Controller
public class UserController {

    /**
     *
     *  SpringMVC  Spring  Mybatis Tomcat：作为服务器  Maven：项目管理工具  Mysql
     */

    @Autowired
    private UserService userService;

    // 登录功能
    @RequestMapping("/loginUser")
    @ResponseBody
    public User loginUser(User user){
        User newUser = userService.loginUser(user);
        return newUser;
    }

    // 修改电话
    @RequestMapping("updatePhone")
    @ResponseBody
    public int updatePhone(User user){
        return userService.updatePhone(user);
    }

    // 修改邮箱
    @RequestMapping("updateEmail")
    @ResponseBody
    public int updateEmail(User user){
        return userService.updateEmail(user);
    }

}
