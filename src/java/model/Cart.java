/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Amoeba
 */
public class Cart {
    List <Book> books;
    Connection conn;
    
    public void addItem(String id){
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books WHERE book_id = '"+id+"'");
            while (rs.next()){
                Book bk = new Book();
                bk.setId(id);
                bk.setAuthor_id(rs.getString("author"));
                bk.setName(rs.getString("name"));
                bk.setPrice(rs.getFloat("price"));
                bk.setWeight(rs.getFloat("weight"));
                books.add(bk);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public List<Book> getBooks(){
        return books;
    }
    
    public Cart(Connection conn){
        this.conn = conn;
        books = new LinkedList<Book>();
    }
    
    public void removeItem(String isbn) {
        books.remove(isbn);
    }
}