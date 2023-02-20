package org.example.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDB {
    public Connection connection = null;
    public PreparedStatement ps = null;
    public ResultSet rs = null;
    public void insert (User user)
    {
        try
        {
            String sql = "INSERT INTO users (email, firstname, lastname) VALUES (?,?,?)";
            connection = new DBConnection().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getFirstname());
            ps.setString(3, user.getLastname());
            ps.execute();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public User getUser (String email)
    {
        try
        {
            String sql = "SELECT * FROM users WHERE email = ?";
            connection = new DBConnection().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();

            while(rs.next())
            {
                User user = new User();
                user.setEmail(rs.getString("email"));
                user.setFirstname(rs.getString("firstname"));
                user.setLastname(rs.getString("lastname"));
                return user;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}


