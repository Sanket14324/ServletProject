package DAO;
import model.User;

import java.sql.*;
public class UserDAO {


    public User getUser(String username){
        System.out.println(username);
        User user = new User();
        try{
            Class driver_class  = Class.forName("com.mysql.cj.jdbc.Driver");
            Driver driver = (Driver) driver_class.newInstance();
            DriverManager.registerDriver(driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false", "root", "Sanket#123");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM userinfo WHERE username="+username);
            System.out.println(rs);
            if(rs.next()){
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
            else {
                return null;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return user;
    }
}
