package service;

import entity.User;

import java.util.List;


public interface UserService {
    /**
     * 用户查询全部
     *
     * @return List <User>
     */
    User findAll(String username, String password);
}
