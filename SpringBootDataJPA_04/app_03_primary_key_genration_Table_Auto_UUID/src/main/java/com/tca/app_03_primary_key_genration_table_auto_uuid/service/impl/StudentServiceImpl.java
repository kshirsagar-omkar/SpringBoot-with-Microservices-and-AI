package com.tca.app_03_primary_key_genration_table_auto_uuid.service.impl;

import com.tca.app_03_primary_key_genration_table_auto_uuid.model.Student;
import com.tca.app_03_primary_key_genration_table_auto_uuid.repository.StudentRepository;
import com.tca.app_03_primary_key_genration_table_auto_uuid.service.StudentService;
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
