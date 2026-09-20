package com.tca.app_02_crudrepo.runner_start;


import com.tca.app_02_crudrepo.enums.Gender;
import com.tca.app_02_crudrepo.model.Student;
import com.tca.app_02_crudrepo.repository.StudentRepository;
import com.tca.app_02_crudrepo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    private StudentService studentService;


    @Override
    public void run(ApplicationArguments args) throws Exception {



        List<Student> students = studentService.findAll();
        printStudentsList(students);


/*
        //JPQL
        List<Student> students1 = studentService.findAllByNameUsingJPQL("aaa");
        printStudentsList(students1);

        //Native SQL
        List<Student> students2 = studentService.findAllByNameUsingNativeSQL("bbb");
        printStudentsList(students2);
*/
/*
        //Projection SQL ------ selective column
        List<String> names = studentService.findNameByGender(Gender.MALE);
        System.out.println("Gender :" + Gender.MALE);
        for(String name : names){
            System.out.println("name : " + name);
        }
*/



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
