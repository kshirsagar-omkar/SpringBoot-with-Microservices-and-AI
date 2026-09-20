package com.tca.app_06_manytoonebidirection.service.impl;

import com.tca.app_06_manytoonebidirection.model.Course;
import com.tca.app_06_manytoonebidirection.model.Student;
import com.tca.app_06_manytoonebidirection.repository.StudentRepository;
import com.tca.app_06_manytoonebidirection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Course> getCourseByStudent(Student student) {
        return studentRepository.getCourseByStudent(student);
    }
}