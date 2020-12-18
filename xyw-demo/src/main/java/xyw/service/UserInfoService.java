package xyw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyw.dao.UserInfoDao;
import xyw.vo.User;
import xyw.vo.UserInfo;

import java.util.List;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;


    // 查询所有登录记录
    public List<UserInfo> queryAll() {
        List<UserInfo> userInfos = userInfoDao.queryAll();
        return userInfos;
    }

    // 根据uid查询
    public UserInfo queryByUid(Integer uid) {
        UserInfo userInfo = userInfoDao.queryByUid(uid);
        return userInfo;
    }
}
