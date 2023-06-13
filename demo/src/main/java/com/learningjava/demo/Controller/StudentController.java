package com.learningjava.demo.Controller;

import java.util.List;

import com.learningjava.demo.Model.Student;
import com.learningjava.demo.Service.StudentService;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/demo" )
@Api( value = "Student API REST" )
@CrossOrigin( origins = "*" )

public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    @GetMapping("/students")
    public ResponseEntity<List<Student>> findAll()
    {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> create (Student student){
        return new ResponseEntity<>(studentService.create(student), HttpStatus.OK);
    }
}
