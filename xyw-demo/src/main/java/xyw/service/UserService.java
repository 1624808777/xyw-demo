package xyw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyw.dao.UserDao;
import xyw.vo.User;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User loginUser(User user) {
        User newUser = userDao.loginUser(user);
        return newUser;
    }

    public int updatePhone(User user) {
        return userDao.updatePhone(user);
    }

    public int updateEmail(User user) {
        return userDao.updateEmail(user);
    }
}
