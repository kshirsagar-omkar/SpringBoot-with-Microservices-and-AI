package com.tca.app_03_dml_using_query_annotation.service;


import com.tca.app_03_dml_using_query_annotation.enums.Gender;
import com.tca.app_03_dml_using_query_annotation.model.Student;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StudentService {

    public Integer updateNameById(String name, Long id);
}
