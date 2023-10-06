package com.example.SpringBootRestCRUD.repository;

import com.example.SpringBootRestCRUD.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    private JdbcTemplate  jdbcTemplate;

    public BookRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //Create
    public  int createBook(Book book){
        String sql ="INSERT INTO books(title, price) VALUES(?,?)";
        return jdbcTemplate.update(sql,book.getTitle(),book.getPrice());
    }

    //Read
    public List<Book> getBooks(){
        return jdbcTemplate.query("SELECT * FROM books",new BeanPropertyRowMapper<>(Book.class));
    }

    //Update
    public void editBook(int id, Book book){
        String sql ="UPDATE books SET title=?, price=? WHERE id=?";
        jdbcTemplate.update(sql,book.getTitle(),book.getPrice(),id);
    }

    //Delete
    public void deleteBook(int id){
        String sql="DELETE FROM books WHERE id=?";
         jdbcTemplate.update(sql,id);
    }


}
