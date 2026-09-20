package com.tca.app_01_primary_key_generation_identity.runner;

import com.tca.app_01_primary_key_generation_identity.model.Student;
import com.tca.app_01_primary_key_generation_identity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class MyRunner implements ApplicationRunner {



    @Autowired
    private StudentService studentService;


    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {


        Student student = new Student();
//        student.setId(1L);
        student.setName("John Doe");
        student.setPercentage(85.5);

        student = studentService.save(student);

        System.out.println("Student saved with ID: " + student.getId());

    }
}
