package com.tca.app_04_primary_key_genration_custom.service.impl;

import com.tca.app_04_primary_key_genration_custom.model.Student;
import com.tca.app_04_primary_key_genration_custom.repository.StudentRepository;
import com.tca.app_04_primary_key_genration_custom.service.StudentService;
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
