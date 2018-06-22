package service.Impl;


import dao.UserDao;
import entity.User;
import service.UserService;



public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();

    @Override
    public User findAll(String username, String password) {
      return userDao.find(username, password);
    }
}
