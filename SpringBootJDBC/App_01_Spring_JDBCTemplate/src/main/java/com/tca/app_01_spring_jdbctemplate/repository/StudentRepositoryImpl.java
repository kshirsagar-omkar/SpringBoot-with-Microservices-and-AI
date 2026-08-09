package com.tca.app_01_spring_jdbctemplate.repository;

import com.tca.app_01_spring_jdbctemplate.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public int save(Student student) {

        String SQL = "INSERT INTO STUDENT VALUES(?,?,?,?)";
        return jdbcTemplate.update(SQL, student.getStudentRno(), student.getStudentName(), student.getStudentPer(), student.getStudentCity());
    }

    @Override
    public int update(Student student) {
        String SQL = "UPDATE STUDENT SET STUDENTNAME=?, STUDENTPER=?, STUDENTCITY=? WHERE STUDENTRNO=?";
        return jdbcTemplate.update(SQL, student.getStudentName(), student.getStudentPer(), student.getStudentCity(), student.getStudentRno());
    }

    @Override
    public int delete(int studentRno) {
        String SQL = "DELETE FROM STUDENT WHERE STUDENTRNO=?";
        return jdbcTemplate.update(SQL, studentRno);
    }

    @Override
    public Student findById(int studentRno) {
        return null;
    }
}
