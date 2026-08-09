package com.tca.app_01_spring_jdbctemplate.repository;


import com.tca.app_01_spring_jdbctemplate.model.Student;

public interface StudentRepository {

    public abstract int save(Student student);
    public abstract int update(Student student);
    public abstract int delete(int studentRno);
    public abstract Student findById(int studentRno);


}
