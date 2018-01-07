package com.ihome.service;

import com.ihome.dao.BookDao;
import com.ihome.dao.BookTypeDao;
import com.ihome.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 图书业务
 */
@Service
public class BookService {
    @Autowired private BookDao bookDao;
    @Autowired private BookTypeDao bookTypeDao;

    /**
     * 图书上架
     * @param book
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED ,readOnly = true)
    public boolean addBook(Book book){

        return bookDao.addBook(book) && bookTypeDao.updateBookType(book.getBookType());
    }

    /**
     * 图书下架\
     * readOnly = true 只读表示不能更改 可以查询
     * @param book
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public boolean underBook(Book book){
        return bookDao.addBook(book) && bookTypeDao.downBook(book.getBookType());
    }

}
