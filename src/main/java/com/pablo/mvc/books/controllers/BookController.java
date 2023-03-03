package com.pablo.mvc.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pablo.mvc.books.models.Book;
import com.pablo.mvc.books.services.BookService;

import java.util.List;

@Controller // controllers return a jsp template page
public class BookController {
    @Autowired
    BookService bookService;

//    @RequestMapping("/api/books")
//    public String index(Model model ) {
//        List<Book> books = bookService.allBooks();
//        model.addAttribute("allBooks", books);
//        return "index.jsp";
//    }
    @RequestMapping("/books")
    public String index(Model model ) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("allBooks", books);
        return "index.jsp";
    }
    @RequestMapping("/books/{id}")
    public String show(Model model, @PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        model.addAttribute("showBook", book);
        return "show.jsp";
    }
}
