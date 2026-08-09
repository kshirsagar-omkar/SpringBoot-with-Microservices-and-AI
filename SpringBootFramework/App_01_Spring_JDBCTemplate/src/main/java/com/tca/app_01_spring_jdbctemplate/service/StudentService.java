package com.tca.app_01_spring_jdbctemplate.service;

import com.tca.app_01_spring_jdbctemplate.model.Student;

public interface StudentService {

    public abstract int save(Student student);
    public abstract int update(Student student);
    public abstract int delete(int studentRno);
    public abstract Student findById(int studentRno);

}
