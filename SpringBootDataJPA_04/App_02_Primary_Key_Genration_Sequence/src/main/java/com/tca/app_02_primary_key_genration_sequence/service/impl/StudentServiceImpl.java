package com.tca.app_02_primary_key_genration_sequence.service.impl;

import com.tca.app_02_primary_key_genration_sequence.model.Student;
import com.tca.app_02_primary_key_genration_sequence.repository.StudentRepository;
import com.tca.app_02_primary_key_genration_sequence.service.StudentService;
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
