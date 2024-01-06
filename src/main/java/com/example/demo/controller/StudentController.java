package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    private List<Student> students = new LinkedList<>();

    public StudentController() {
        Student student = new Student();
        student.setId(1);
        student.setName("Sanjar");
        student.setSurname("Sultanov");
        students.add(student);
        student = new Student();
        student.setId(2);
        student.setName("Sardor");
        student.setSurname("Sultanov");
        students.add(student);
        student = new Student();
        student.setId(3);
        student.setName("Sarvar");
        student.setSurname("Sultanov");
        students.add(student);
    }

    @PostMapping("/creat/{name}/{surname}")
    @ResponseBody
    public boolean creat(@PathVariable("name") String name,@PathVariable("surname") String surname){
        if (name != null) {
            Student student = new Student();
            student.setName(name);
            student.setSurname(surname);
            students.add(student);
            return true;
        }
        return false;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Student> getAll() {
        return students;
    }
    @GetMapping("/all/{id}")
    @ResponseBody
    public Student getAll(@PathVariable("id") Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return new Student();
    }


    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public boolean delete(@PathVariable("id") Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
    @PutMapping("/update/{id}")
    @ResponseBody
    public boolean update(@PathVariable("id") Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                // todo
                return true;
            }
        }
        return false;
    }



}
