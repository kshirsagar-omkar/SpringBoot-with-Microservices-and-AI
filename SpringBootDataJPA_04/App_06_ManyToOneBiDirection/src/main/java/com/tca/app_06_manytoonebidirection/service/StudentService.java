package com.tca.app_06_manytoonebidirection.service;

import com.tca.app_06_manytoonebidirection.model.Course;
import com.tca.app_06_manytoonebidirection.model.Student;

import java.util.List;

public interface StudentService {
    public Student save(Student student);
    public List<Course> getCourseByStudent(Student student);
}
