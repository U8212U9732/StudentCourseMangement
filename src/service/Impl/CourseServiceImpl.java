package service.Impl;

import dao.CourseDao;
import entity.Course;
import service.CourseService;

import java.util.List;


public class CourseServiceImpl implements CourseService{

    private CourseDao courseDao = new CourseDao();
    @Override
    public List<Course> findAll() {
       return courseDao.find();
    }

    @Override
    public void classDelete(String id) {
        courseDao.classDelete(id);
    }

    @Override
    public void classUpdate(String id, String name, String teacher, String number) {
        courseDao.classUpdate(id,name,teacher,number);
    }

    @Override
    public void classAdd(String id, String name, String teacher, String number) {
        courseDao.classAdd(id,name,teacher,number);
    }

    @Override
    public List <Course> findByName(String name) {
        return courseDao.findByName(name);
    }
}
