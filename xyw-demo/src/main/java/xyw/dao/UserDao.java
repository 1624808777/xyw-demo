package xyw.dao;

import xyw.vo.User;

public interface UserDao {

    // 登录
    User loginUser(User user);
    // 修改用户手机
    int updatePhone(User user);
    // 修改邮箱
    int updateEmail(User user);
}
