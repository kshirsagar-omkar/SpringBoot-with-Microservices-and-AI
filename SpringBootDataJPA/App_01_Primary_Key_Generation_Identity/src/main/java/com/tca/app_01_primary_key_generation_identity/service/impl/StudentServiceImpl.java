package com.tca.app_01_primary_key_generation_identity.service.impl;

import com.tca.app_01_primary_key_generation_identity.model.Student;
import com.tca.app_01_primary_key_generation_identity.repository.StudentRepository;
import com.tca.app_01_primary_key_generation_identity.service.StudentService;
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
