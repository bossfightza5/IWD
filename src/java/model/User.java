/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amoeba
 */
public class User {
    private String username;
    private String password;
    private String address;
    private String email;
    private String fname;
    private String lname;
    
    private Connection conn;
    
    
    private Statement stmt;
    private ResultSet rs;

        
    
    public User(){
        
    }
    
    public void getDB(){
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM user WHERE username = '"+username+"'");
        }catch(SQLException ex){
           Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void add(){
        try{
        stmt.executeUpdate("INSERT INTO dokfah.user VALUES('"+username+"', '"+password+"', '"+email+"', '"+fname+"', '"+lname+"', '"+address+"')");
        }catch(SQLException ex){
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
