package com.SpringBoot.First_Application.Book;

import org.springframework.web.bind.annotation.*;
import java.util.LinkedList;
import java.util.List;
@RestController
@RequestMapping("/book/")
public class Book_Controller {
    List<Book_Info> bookList = new LinkedList<>();
    Integer id = 0;

    @GetMapping("/list")
    public List<Book_Info> booKList(){
        return bookList;
    }

    @GetMapping("/{id}")
    public Book_Info getBook(@PathVariable Integer id){
        return bookList.get(id-1);
    }

    @PostMapping ("/add")
    public Book_Info addbook(@RequestBody Book_Info book){
        book.setId(++id);
        bookList.add(book);
        return book;
    }

    @DeleteMapping("/delete")
    public void deleteBook(@RequestParam Integer id){
        bookList.remove(id-1);
    }

    @PutMapping("/update/{id}")
    public Book_Info addbook(@PathVariable Integer id, @RequestBody Book_Info book){
        for (int i=0; i<bookList.size(); i++){
            if (bookList.get(i).getId().equals(id)){
                bookList.set(i,book);
                break;
            }
        }
        return book;
    }
}
