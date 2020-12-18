package xyw.dao;

import xyw.vo.User;
import xyw.vo.UserInfo;

import java.util.List;

public interface UserInfoDao {

    List<UserInfo> queryAll();

    UserInfo queryByUid(Integer uid);
}
