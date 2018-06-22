package dao;

import entity.Course;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CourseDao {

    private String url = "jdbc:sqlserver://localhost:1433;databaseName=Student";
    private String user = "sa";
    private String password1 = "kingston";
    PreparedStatement stmt = null;
    Connection conn = null;
    ResultSet rs = null;

    /**
     * 查询全部课程
     *
     * @return List <Course>
     */
    public List <Course> find() {
        List list = new ArrayList();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password1);
            String sql = "SELECT * FROM class";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String teacher = rs.getString("teacher");
                String number = rs.getString("number");
                System.out.println(id + "" + name + "" + teacher + "" + number);
                Course course = new Course();
                course.setId(id);
                course.setName(name);
                course.setTeacher(teacher);
                course.setNumber(number);
                list.add(course);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * 通过id删除课程
     *
     * @param id 课程id
     */
    public void classDelete(String id) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password1);
            String sql = "DELETE FROM class WHERE id=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            int count = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * 修改课程信息
     *
     * @param id      课程id
     * @param name    课程名字
     * @param teacher 任课教师
     * @param number  编辑编号
     */
    public void classUpdate(String id, String name, String teacher, String number) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password1);
            String sql = "UPDATE class SET name=?,teacher=?,number=? WHERE id=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, teacher);
            stmt.setString(3, number);
            stmt.setString(4, id);
            int count = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void classAdd(String id, String name, String teacher, String number) {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password1);
            String sql = "INSERT INTO class(id,name,teacher,number) VALUES (?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, teacher);
            stmt.setString(4, number);
            int count = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    public  List <Course> findByName(String name) {
        List list = new ArrayList();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password1);
            String sql = "SELECT * FROM class WHERE teacher LIKE ?";
            stmt = conn.prepareStatement(sql);
            String name1="%"+name+"%";
            stmt.setString(1,name1);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String name2 = rs.getString("name");
                String teacher = rs.getString("teacher");
                String number = rs.getString("number");
                Course course = new Course();
                course.setId(id);
                course.setName(name2);
                course.setTeacher(teacher);
                course.setNumber(number);
                list.add(course);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
