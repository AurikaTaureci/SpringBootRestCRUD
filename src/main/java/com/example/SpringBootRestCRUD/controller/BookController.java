package com.example.SpringBootRestCRUD.controller;

import com.example.SpringBootRestCRUD.model.Book;
import com.example.SpringBootRestCRUD.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller

@RestController
@RequestMapping("api")
//@ResponseBody
public class BookController {
     final private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.bookList();
    }

    @PostMapping("/addBook")
    public int addBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping("/editBook/{id}")
    public void editBook(@PathVariable int id, @RequestBody Book book){
        bookService.editBook(id,book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable int id){
         bookService.deleteBook(id);
    }

    @DeleteMapping("/deleteBooks/{id}")
    public ResponseEntity deleteBooks(@PathVariable int id){
        bookService.deleteBook(id);
        return new ResponseEntity<>("The book has been deleted ", HttpStatus.NO_CONTENT);
    }
}
