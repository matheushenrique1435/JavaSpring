package com.learningjava.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningjava.demo.Model.Student;
import com.learningjava.demo.Repository.StudentRepository;

@Service
public class StudentService{

    @Autowired(required = false)
    private StudentRepository studentRepository;

    public List<Student> findAll()
    {
        return studentRepository.findAll();
    }
    
    public Student create(Student student){
        return this.studentRepository.save(student);
    }


}
