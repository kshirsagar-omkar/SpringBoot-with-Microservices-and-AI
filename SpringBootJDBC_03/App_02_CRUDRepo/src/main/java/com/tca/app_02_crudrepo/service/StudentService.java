package com.tca.app_02_crudrepo.service;

import com.tca.app_02_crudrepo.enums.Gender;
import com.tca.app_02_crudrepo.model.Student;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StudentService {

    public List<Student> findAll();

    public List<Student> findAllByNameUsingJPQL(@Param("name") String name);
    public List<Student> findAllByNameUsingNativeSQL(@Param("name") String name);

    public List<String> findNameByGender( Gender gender);

}
