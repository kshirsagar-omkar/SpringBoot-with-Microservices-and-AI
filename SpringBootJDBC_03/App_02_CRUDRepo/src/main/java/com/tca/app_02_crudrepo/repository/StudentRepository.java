package com.tca.app_02_crudrepo.repository;

import com.tca.app_02_crudrepo.enums.Gender;
import com.tca.app_02_crudrepo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    //CRUD Repo Method
    List<Student> findAll();

    //JPQL Query
    @Query("SELECT s FROM Student s WHERE s.name=:name")
    List<Student> findAllByNameUsingJPQL(@Param("name") String name);


    //Native SQL Query
    @Query(value="SELECT * FROM student WHERE name=:name", nativeQuery = true)
    List<Student> findAllByNameUsingNativeSQL(@Param("name") String name);



    //Scaler Projection -------- Selective Columns

    @Query("SELECT s.name FROM Student s WHERE s.gender=:gender")
    List<String> findNameByGender(@Param("gender") Gender gender);



}
