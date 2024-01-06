package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    private List<Book> books = new LinkedList<>();

    public BookController() {
        Book student = new Book();
        student.setId(1);
        student.setAuthor("Sanjar");
        student.setTitle("abcdaesefdewsd");
        books.add(student);
        student = new Book();
        student.setId(2);
        student.setAuthor("Sardor");
        student.setTitle("abcdaesefdewsd");
        books.add(student);
        student = new Book();
        student.setId(3);
        student.setAuthor("Sarvar");
        student.setTitle("abcdaesefdewsd");
        books.add(student);
    }

    @PostMapping("/creat/{author}")
    @ResponseBody
    public boolean creat(@PathVariable("author") String author){
        if (author != null) {
            Book student = new Book();
            student.setAuthor(author);
            books.add(student);
            return true;
        }
        return false;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Book> getAll() {
        return books;
    }
    @GetMapping("/all/{id}")
    @ResponseBody
    public Book getAll(@PathVariable("id") Integer id) {
        for (Book student : books) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return new Book();
    }


    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public boolean delete(@PathVariable("id") Integer id) {
        for (Book student : books) {
            if (student.getId().equals(id)) {
                books.remove(student);
                return true;
            }
        }
        return false;
    }
    @PutMapping("/update/{id}")
    @ResponseBody
    public boolean update(@PathVariable("id") Integer id) {
        for (Book student : books) {
            if (student.getId().equals(id)) {
                // todo
                return true;
            }
        }
        return false;
    }



}
