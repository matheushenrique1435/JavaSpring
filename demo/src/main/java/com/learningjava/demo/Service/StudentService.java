package com.learningjava.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningjava.demo.Model.Student;
import com.learningjava.demo.Repository.StudentRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Service
public class StudentService{

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll()
    {
        return studentRepository.findAll();
    }
    
    public Student create(@RequestBody Student student){
        return this.studentRepository.save(student);
    }

    public Student update(@RequestBody Student student) throws Exception {
        if(student.getID() == null)
            throw new Exception("Register not found");
        return this.studentRepository.save(student);
    }

    public void deleteById(Integer id){
        this.studentRepository.deleteById((id));
    }

}
