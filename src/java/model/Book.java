/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Amoeba
 */
public class Book {
    private String id;
    private String name;
    private String describe;
    private String type;
    private String picture;
    private int quantity=0;
    private double price;
    private double total_price;
    private double weight;

    public Book(String id, String name, String describe, String type, String picture, Double price, Double weight) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.type = type;
        this.picture = picture;
        this.price = price;
        this.weight = weight;
    }
    
    public Book(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
    
}
