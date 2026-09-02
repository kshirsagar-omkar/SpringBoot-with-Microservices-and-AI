package com.tca.app_03_dml_using_query_annotation.runner_start;




import com.tca.app_03_dml_using_query_annotation.model.Student;
import com.tca.app_03_dml_using_query_annotation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    private StudentService studentService;


    @Override
    public void run(ApplicationArguments args) throws Exception {


        //Update Query
        String name = "OMKAR";
        Long id = 110L;

        if(studentService.updateNameById(name, id) > 0){
            System.out.println("Student name updated successfully for ID: " + id);
        } else {
            System.out.println("Failed to update student name for ID: " + id);
        }




    }



    private static void printStudent(Student student) {

        System.out.println(
                "Student ID: " + student.getId() +
                ", Name: " + student.getName() +
                ", Percentage: " + student.getPercentage() +
                ", City: " + student.getCity() +
                ", Gender: " + student.getGender() + "\n" +
                "-".repeat(50)
        );

    }

    private static void printStudentsList(Iterable<Student> students) {
        for (Student student : students) {
            printStudent(student);
        }
    }
}
