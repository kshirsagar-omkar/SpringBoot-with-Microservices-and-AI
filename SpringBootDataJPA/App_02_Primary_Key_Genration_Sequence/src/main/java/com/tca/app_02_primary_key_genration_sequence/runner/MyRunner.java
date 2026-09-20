package com.tca.app_02_primary_key_genration_sequence.runner;

import com.tca.app_02_primary_key_genration_sequence.model.Student;
import com.tca.app_02_primary_key_genration_sequence.service.StudentService;
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
