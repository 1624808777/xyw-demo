package xyw.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyw.service.UserInfoService;
import xyw.vo.User;
import xyw.vo.UserInfo;

import java.util.List;

@Controller
public class UserInfoControler {

    @Autowired
    private UserInfoService userInfoService;


    // 查询所有
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<UserInfo> queryAll(){
        List<UserInfo> userInfos = userInfoService.queryAll();
        return userInfos;
    }

    // 根据userId查询
    @RequestMapping("/queryByUid")
    @ResponseBody
    public UserInfo queryByUid(Integer uid){
        UserInfo userInfo = userInfoService.queryByUid(uid);
        return userInfo;
    }


}
