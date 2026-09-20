package com.tca.app_06_manytoonebidirection.repository;

import com.tca.app_06_manytoonebidirection.model.Course;
import com.tca.app_06_manytoonebidirection.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
