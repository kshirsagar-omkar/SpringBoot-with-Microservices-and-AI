package com.tca.app_06_manytoonebidirection.runner;

import com.tca.app_06_manytoonebidirection.model.Course;
import com.tca.app_06_manytoonebidirection.model.Student;
import com.tca.app_06_manytoonebidirection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class MyRunner implements ApplicationRunner {



    @Autowired
    private StudentService studentService;


    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {


        Student student = new Student();
        student.setStudentId(1L);
        student.setName("Omkar Kshirsagar");
        student.setPercentage(85.5);

        student.setCourses(Arrays.asList(
                new Course(101L, "Java", student),
                new Course(102l, "C++", student)
        ));


        student = studentService.save(student);

        System.out.println("Student saved with ID: " + student.getStudentId());

    }
}