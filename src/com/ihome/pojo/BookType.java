package com.ihome.pojo;

import java.io.Serializable;

/**
 * 图书类型实体类
 */
public class BookType implements Serializable{
    private Integer id;
    private String title;
    private Integer count;// 类型的数量

    public BookType() {
    }

    public BookType(Integer id, String title, Integer count) {
        this.id = id;
        this.title = title;
        this.count = count;
    }

    public Integer getId() {
        return id;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", count=" + count +
                '}';
    }
}
