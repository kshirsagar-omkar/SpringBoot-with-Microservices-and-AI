package com.tca.app_01_spring_jdbctemplate.util;

import com.tca.app_01_spring_jdbctemplate.model.Student;

public class StudentUtility {

    public static Student toLowerCase(Student student) {
        if (student != null) {

            student.setStudentName(student.getStudentName().toLowerCase());
            student.setStudentCity(student.getStudentCity().toLowerCase());

        }
        return student;
    }

}
