package com.ihome.dao;

import com.ihome.pojo.BookType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 图书类型DAO
 */
@Repository
public class BookTypeDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 添加图书的类型
     * @param bookType
     * @return
     */
    public boolean addBookType(BookType bookType){
        String sql = "insert into bookType(title,count) values(?,?)";
        Object[] params = {bookType.getTitle(), bookType.getCount()};
        return jdbcTemplate.update(sql,params)>0;
    }

    /**
     * 更改图书数量
     * @param bookType
     * @return
     */
    public boolean updateBookType(BookType bookType){
        String sql = "update book_type set count = count+1 where id=?";
        Object[] params = {bookType.getId()};
        return jdbcTemplate.update(sql,params)> 0;
    }
    public boolean downBook(BookType bookType){
        String sql = "update book_type set count = count-1 where id=?";
        return jdbcTemplate.update(sql,bookType.getId()) > 0;
    }
}
