package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

/**
* Book (id,title,author, publishYear)
* Student (id, name, surname,phone, createdDate)
* */
@Data
public class Book
{
    private Integer id;
    private String title;
    private String author;
    private String publishYear;
}
