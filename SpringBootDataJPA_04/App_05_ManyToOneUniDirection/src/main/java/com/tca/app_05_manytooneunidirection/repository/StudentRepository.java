package com.tca.app_05_manytooneunidirection.repository;

import com.tca.app_05_manytooneunidirection.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {




}