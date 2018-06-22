package service;

import entity.UserClass;

import java.util.List;


public interface UserClassService {


    /**
     * 查询自己全部课程
     *
     * @return List<UserClass>
     */
    public List<UserClass> userClassFindAll(String username);
    /**
     * 向数据库添加所选课程
     * @param id 主键
     * @param username 学生姓名
     * @param classname 课程名称
     * @param classteacher 任课教师
     * @param classnumber 编辑编号
     */
    void userClassAdd(String id,String username,String classname,String classteacher,String classnumber);
}
