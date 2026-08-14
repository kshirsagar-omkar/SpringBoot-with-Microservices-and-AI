package com.tca.app_01_spring_jdbctemplate;

import com.tca.app_01_spring_jdbctemplate.model.Student;
import com.tca.app_01_spring_jdbctemplate.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class App01SpringJdbcTemplateApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App01SpringJdbcTemplateApplication.class, args);

        StudentService studentService = context.getBean(StudentService.class);


        Map<String, Object> student = studentService.findById(101);
        System.out.println(student);

        List<Map<String, Object>> students = studentService.findAll();
        System.out.println(students);



        /*
        Student student = new Student(101, "Omkar", 95.88, "PUNE");

        if(studentService.save(student) > 0){
            System.out.println("Student saved successfully");
        } else {
            System.out.println("Failed to save student");
        }

         */


        /*
        Student updatedStudent = new Student(101, "Omkar", 56.50, "PUNE");

        if(studentService.update(updatedStudent) > 0){
            System.out.println("Student updated successfully");
        } else {
            System.out.println("Failed to update student");
        }
        */



        /*
        if(studentService.delete(101) > 0){
            System.out.println("Student deleted successfully");
        } else {
            System.out.println("Failed to delete student");
        }
        */

    }

}
