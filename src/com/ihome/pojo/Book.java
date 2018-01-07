package com.ihome.pojo;

import java.io.Serializable;

/**
 * 图书实体类
 */
public class Book implements Serializable{
    private Integer id;
    private String title;
    private double price;

    private BookType bookType;// 图书的类型

    public Book() {
    }

    public Book(Integer id, String title, double price, BookType bookType) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.bookType = bookType;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", bookType=" + bookType +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
}
