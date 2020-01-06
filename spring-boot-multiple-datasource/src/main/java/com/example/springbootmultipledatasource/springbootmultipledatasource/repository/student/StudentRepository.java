package com.example.springbootmultipledatasource.springbootmultipledatasource.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootmultipledatasource.springbootmultipledatasource.entity.student.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
