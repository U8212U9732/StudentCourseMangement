package service;

import entity.Course;

import java.util.List;


public interface CourseService {
    /**
     * 查询全部课程
     *
     * @return List <Course>
     */
    List <Course> findAll();

    /**
     * 通过id删除课程
     * @param id 课程id
     */
    void classDelete(String id);

    /**
     * 修改课程信息
     *
     * @param id      课程id
     * @param name    课程名字
     * @param teacher 任课教师
     * @param number  编辑编号
     */
    void classUpdate(String id,String name,String teacher,String number);

    /**
     * 添加课程信息
     *
     * @param id      课程id
     * @param name    课程名字
     * @param teacher 任课教师
     * @param number  编辑编号
     */
    void classAdd(String id,String name,String teacher,String number);

    /**
     * 查询全部课程
     *
     * @return List <Course>
     */
    List <Course> findByName(String name);
}
