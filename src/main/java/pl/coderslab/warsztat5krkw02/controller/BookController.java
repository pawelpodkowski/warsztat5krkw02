package pl.coderslab.warsztat5krkw02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.warsztat5krkw02.model.Book;
import pl.coderslab.warsztat5krkw02.service.MemoryBookService;

@RestController //wszystkie metody musza zwracać String
@RequestMapping("/books")
public class BookController {

    private MemoryBookService mbs;

    @Autowired
    public BookController(MemoryBookService mbs) {
        this.mbs = mbs;
    }

    @GetMapping("/hello")
    public String hello() {
        return "{hello: World}";
    }
    @GetMapping("/hellobook")
    public Book helloBook(){
        return new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming");
    }
}
