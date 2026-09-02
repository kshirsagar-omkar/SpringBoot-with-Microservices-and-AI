package com.tca.app_03_dml_using_query_annotation.service.impl;

import com.tca.app_03_dml_using_query_annotation.enums.Gender;
import com.tca.app_03_dml_using_query_annotation.model.Student;
import com.tca.app_03_dml_using_query_annotation.repository.StudentRepository;
import com.tca.app_03_dml_using_query_annotation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Integer updateNameById(String name, Long id) {
        if(name==null||id==null){
            return 0;
        }
        return studentRepository.updateNameById(name, id);
    }
}
