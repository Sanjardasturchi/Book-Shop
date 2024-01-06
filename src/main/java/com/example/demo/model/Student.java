package com.example.demo.model;

import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Book (id,title,author, publishYear)
 * Student (id, name, surname,phone, createdDate)
 * */

@Data
public class Student
{
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    private LocalDate createdDate;
}
