package org.kevin.Deep_seek;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    //simpple in-memory database
    private List<Book> books = new ArrayList<>();

    //get all books
    @GetMapping
    public List<Book> getAllBooks(){
        return books;
    }

    //get a book by id
    @GetMapping("/id")
    public Book getBookById(@PathVariable int id){
        return books.stream().filter(book -> book.getId() == id)
                .findFirst().orElseThrow(()->new RuntimeException("book not found"));
    }

    //post a new book
    @PostMapping
    public Book addBook(@RequestBody Book book){
        books.add(book);
        return book;
    }

    @PutMapping("/id")
    public Book updateBook(@PathVariable int id, @RequestBody Book updateBook){
        //logic to update book (relace with actual DB book)
        return updateBook;
    }

    //delete book
    @DeleteMapping("/id")
    public void deleteBook(@PathVariable int id){
        books.removeIf((book -> book.getId() == id));
    }
}
