package com.tca.app_02_crudrepo.service.impl;

import com.tca.app_02_crudrepo.enums.Gender;
import com.tca.app_02_crudrepo.model.Student;
import com.tca.app_02_crudrepo.repository.StudentRepository;
import com.tca.app_02_crudrepo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public List<Student> findAllByNameUsingJPQL(String name) {
        if(name==null || name.isEmpty()){
            return List.of();
        }
        return studentRepository.findAllByNameUsingJPQL(name);
    }

    @Override
    public List<Student> findAllByNameUsingNativeSQL(String name) {
        if(name==null || name.isEmpty()){
            return List.of();
        }
        return studentRepository.findAllByNameUsingNativeSQL(name);
    }

    @Override
    public List<String> findNameByGender(Gender gender) {
        if(gender==null){
            return List.of();
        }
        return studentRepository.findNameByGender(gender);
    }
}
