package com.tca.app_01_spring_jdbctemplate.repository;


import com.tca.app_01_spring_jdbctemplate.model.Student;

import java.util.List;
import java.util.Map;

public interface StudentRepository {

    public abstract int save(Student student);
    public abstract int update(Student student);
    public abstract int delete(int studentRno);
    public abstract Map<String, Object> findById(int studentRno);
    public abstract List<Map<String, Object>> findAll();


}
