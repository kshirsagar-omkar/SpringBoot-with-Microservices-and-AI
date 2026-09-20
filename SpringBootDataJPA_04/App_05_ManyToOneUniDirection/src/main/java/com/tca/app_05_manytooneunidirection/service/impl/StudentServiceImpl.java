package com.tca.app_05_manytooneunidirection.service.impl;

import com.tca.app_05_manytooneunidirection.model.Student;
import com.tca.app_05_manytooneunidirection.repository.StudentRepository;
import com.tca.app_05_manytooneunidirection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}