package com.tca.app_01_spring_jdbctemplate.service;


import com.tca.app_01_spring_jdbctemplate.util.StudentUtility;
import com.tca.app_01_spring_jdbctemplate.model.Student;
import com.tca.app_01_spring_jdbctemplate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public int save(Student student) {

        try{
            return studentRepository.save(StudentUtility.toLowerCase(student));
        }
        catch (Exception e){
            System.out.println("Exception in StudentServiceImpl.save() : " + e.getMessage());
            return 0;
        }

    }

    @Override
    public int update(Student student) {
        try{
            return studentRepository.update(StudentUtility.toLowerCase(student));
        }
        catch (Exception e){
            System.out.println("Exception in StudentServiceImpl.update() : " + e.getMessage());
            return 0;
        }
    }

    @Override
    public int delete(int studentRno) {
        try{
            return studentRepository.delete(studentRno);
        }
        catch (Exception e){
            System.out.println("Exception in StudentServiceImpl.delete() : " + e.getMessage());
            return 0;
        }
    }

    @Override
    public Map<String, Object> findById(int studentRno) {
        try{
            return studentRepository.findById(studentRno);
        }
        catch (Exception e){
            System.out.println("Exception in StudentServiceImpl.findById() : " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Map<String, Object>> findAll() {
        try{
            return studentRepository.findAll();
        }
        catch (Exception e){
            System.out.println("Exception in StudentServiceImpl.findAll() : " + e.getMessage());
            return null;
        }
    }
}
