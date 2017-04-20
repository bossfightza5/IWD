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
    public List <Book> books;
    
    public Cart(){
        books = new LinkedList<Book>();
    }

    public List<Book> getBooks() {
        return books;
    }
    
    public void addBook(Book b){
        books.add(b);
        
    }
    
    public void removeItem(String isbn) {
        books.remove(isbn);
    }
}
