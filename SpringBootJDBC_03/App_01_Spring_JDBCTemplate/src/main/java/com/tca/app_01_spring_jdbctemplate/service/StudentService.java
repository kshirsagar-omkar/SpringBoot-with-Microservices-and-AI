package com.tca.app_01_spring_jdbctemplate.service;

import com.tca.app_01_spring_jdbctemplate.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    public abstract int save(Student student);
    public abstract int update(Student student);
    public abstract int delete(int studentRno);
    public abstract Map<String, Object> findById(int studentRno);
    public abstract List<Map<String, Object>> findAll();



}
