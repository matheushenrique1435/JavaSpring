package com.learningjava.demo.Model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Table(name = "Student")
@Entity
public class Student implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
    public Integer id;

    @Column(name="Name", nullable = false)
    public String name;

    @Column(name="BirthDate", nullable = false)
    public Date birthDate;

    public Student(Integer iD, String name, Date birthDate) {
        this.id = iD;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer iD) {
        this.id = iD;
    }
}
