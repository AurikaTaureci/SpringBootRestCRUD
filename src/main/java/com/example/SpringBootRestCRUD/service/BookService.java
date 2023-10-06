package com.example.SpringBootRestCRUD.service;

import com.example.SpringBootRestCRUD.model.Book;
import com.example.SpringBootRestCRUD.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    final private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> bookList(){
        return bookRepository.getBooks();
    }

    public int createBook(Book book){
        return bookRepository.createBook(book);
    }

    public void editBook(int id, Book book){
        bookRepository.editBook(id,book);
    }

    public void deleteBook(int id){
        bookRepository.deleteBook(id);
    }


}
