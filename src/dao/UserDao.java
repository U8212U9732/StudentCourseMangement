package dao;

import entity.User;


import java.sql.*;


public class UserDao {
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=Student";
    private String user = "sa";
    private String password1 = "kingston";
    PreparedStatement stmt = null;
    Connection conn = null;
    ResultSet rs = null;

    public User find(String username,String password) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url, user, password1);
            String sql = "SELECT * FROM [user] WHERE username=? AND password=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,username);
            stmt.setString(2,password);
            rs = stmt.executeQuery();
            while(rs.next()) {
                String id = rs.getString("id");
                String username1 = rs.getString("username");
                String password1 = rs.getString("password");
                System.out.println( username1 + "," + password1);
                User user = new User();
                user.setId(id);
                user.setUsername(username);
                user.setPassword(password);
                return user;
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return null;
    }
}
