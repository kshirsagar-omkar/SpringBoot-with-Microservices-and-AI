package com.tca.app_03_primary_key_genration_table_auto_uuid.runner;

import com.tca.app_03_primary_key_genration_table_auto_uuid.model.Student;
import com.tca.app_03_primary_key_genration_table_auto_uuid.service.StudentService;
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
