package kumamon.service;

import kumamon.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {
    /*
    * 保存
    * @param book
    * @return
    */
    public boolean save(Book book);
    /*
     * 修改
     * @param book
     * @return
     */
    public boolean update(Book book);
    /*
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);
    /*
     * 按id获取
     * @param id
     * @return
     */
    public Book getById(Integer id);
    /*
     * 获取全部
     * @return
     */
    public List<Book> getAll();
}
