/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psbo.eta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Multiverse
 * Develop by E.T.A
 */
public class MyConnection {
    public static Connection getConnection(){
        return getConnection("jdbc:mysql://localhost/db_spkk","root", null);
    }
    public static Connection getConnection(String url, String user, String pass){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(url, user, pass);
        }
        catch(ClassNotFoundException | SQLException e){
            System.err.println(e.getMessage());
        }
        return conn;
    }
    
}
