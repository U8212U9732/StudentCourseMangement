package dao;

import entity.UserClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UserClassDao {
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=Student";
    private String user = "sa";
    private String password1 = "kingston";
    PreparedStatement stmt = null;
    Connection conn = null;
    ResultSet rs = null;


    public List<UserClass> userClassFindAll(String username){
        List<UserClass> list = new ArrayList<UserClass>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password1);
            String sql = "SELECT * FROM userclass WHERE username=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,username);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String username1 = rs.getString("username");
                String classname = rs.getString("classname");
                String classteacher = rs.getString("classteacher");
                String classnumber = rs.getString("classnumber");
                UserClass userClass = new UserClass();
                userClass.setId(id);
                userClass.setUsername(username1);
                userClass.setClassname(classname);
                userClass.setClassteacher(classteacher);
                userClass.setClassnumber(classnumber);
                list.add(userClass);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    public void userClassAdd(String id,String username,String classname,String classteacher,String classnumber){
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password1);
            String sql = "INSERT INTO userclass(id,username,classname,classteacher,classnumber) VALUES (?,?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, username);
            stmt.setString(3, classname);
            stmt.setString(4, classteacher);
            stmt.setString(5, classnumber);
            int count = stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
