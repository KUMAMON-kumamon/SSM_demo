package kumamon.service.Impl;

import kumamon.dao.BookDao;
import kumamon.domain.Book;
import kumamon.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        int lines = bookDao.save(book);
        return lines>=0;
    }

    @Override
    public boolean update(Book book) {
        int lines = bookDao.update(book);
        return lines>0;
    }

    @Override
    public boolean delete(Integer id) {
        int lines = bookDao.delete(id);
        return lines>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }


}
