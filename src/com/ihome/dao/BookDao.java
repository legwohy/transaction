package com.ihome.dao;

import com.ihome.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 图书DAO
 */
@Repository
public class BookDao {
    @Autowired JdbcTemplate jdbcTemplate;

    /**
     * 添加图书
     * @param book
     */
    public boolean addBook(Book book){
        String sql = "insert into book(title,price,type_id) values(?,?,?)";
        Object[] params = {book.getTitle(),book.getPrice(),book.getBookType().getId()};
        return jdbcTemplate.update(sql,params) > 0;
    }

    /**
     * 修改图书
     * @param book
     * @return
     */
    public boolean updateBook(Book book){
        String sql = "UPDATE book set title = ?,price = ?,type_id = ?";
        Object[] params = {book.getTitle(),book.getPrice(),book.getBookType()};
        return jdbcTemplate.update(sql,params) > 0;
    }

    /**
     * 删除图书
     * @param id
     * @return
     */
    public boolean delBook(int id){
        String sql = "delete from book where id=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    /**
     * 根据图书标题查找图书
     * @param title
     * @return
     */
    public List<Book> findBooks(String title){
        String sql = "select id,title,price,type_id where title=?";
        return jdbcTemplate.queryForList(sql,Book.class,title);
    }


}
