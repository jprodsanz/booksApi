package com.pablo.mvc.books.services;

import com.pablo.mvc.books.models.Book;
import com.pablo.mvc.books.repositories.BookRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

//Services are the  business logic for our application
@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // this method will update the book
    public Book updateBook(Book updateBook) {
        return bookRepository.save(updateBook);
    }
    public void deleteBook(Long id) {
        Optional<Book> deleteBookAction = bookRepository.findById(id);
        if (deleteBookAction.isPresent()) {
            bookRepository.deleteById(id);
        }
        else {
            System.out.println("Error, can't delete");
        }
    }
}
