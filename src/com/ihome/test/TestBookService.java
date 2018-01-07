package com.ihome.test;

import com.ihome.dao.BookDao;
import com.ihome.pojo.Book;
import com.ihome.pojo.BookType;
import com.ihome.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试图书业务类
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dataSource.xml")
public class TestBookService {
    @Autowired private BookService bookService;
    @Autowired private BookDao bookDao;
    @Test
    public void test1(){
        Book book = new Book();
        book.setTitle("倚天屠龙记");
        book.setPrice(21.5D);

        BookType bookType = new BookType();
        bookType.setTitle("小说");
        bookType.setId(1);
        book.setBookType(bookType);

        Boolean flag = bookService.underBook(book);
        Assert.assertTrue(flag);
    }
    @Test public void test2(){
        boolean flag = bookDao.delBook(1005);
        Assert.assertTrue(flag);
    }

}
