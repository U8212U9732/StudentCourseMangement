package service.Impl;

import dao.UserClassDao;
import entity.UserClass;
import service.UserClassService;

import java.util.List;


public class UserClassServiceImpl implements UserClassService {
    private UserClassDao userClassDao = new UserClassDao();

    @Override
    public List<UserClass> userClassFindAll(String username) {
        return userClassDao.userClassFindAll(username);
    }

    @Override
    public void userClassAdd(String id, String username, String classname, String classteacher, String classnumber) {
        userClassDao.userClassAdd(id, username, classname, classteacher, classnumber);
    }
}
