package com.learningjava.demo.Controller;

import java.util.List;

import com.learningjava.demo.Model.Student;
import com.learningjava.demo.Service.StudentService;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "/students" )
@Api( value = "Student API REST" )
@CrossOrigin( origins = "*" )

public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> findAll()
    {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Student> getById(@RequestParam String id){
        return null;
    }
    @PostMapping("/create")
    public ResponseEntity<Student> create (@RequestBody Student student){
        return new ResponseEntity<>(studentService.create(student), HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Student> update(@RequestBody Student student) {
        try {
            return new ResponseEntity<>(studentService.update(student), HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> delete (@RequestParam Integer id){
        studentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
