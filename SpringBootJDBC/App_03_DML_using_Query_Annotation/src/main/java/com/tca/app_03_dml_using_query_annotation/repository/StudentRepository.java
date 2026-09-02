package com.tca.app_03_dml_using_query_annotation.repository;


import com.tca.app_03_dml_using_query_annotation.model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {



    @Modifying
    @Transactional
    @Query("UPDATE Student s SET s.name=:name WHERE s.id=:id")
    Integer updateNameById(String name, Long id);

}
