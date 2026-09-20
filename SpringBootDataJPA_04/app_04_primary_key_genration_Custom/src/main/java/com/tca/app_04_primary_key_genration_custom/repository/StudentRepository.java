package com.tca.app_04_primary_key_genration_custom.repository;

import com.tca.app_04_primary_key_genration_custom.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {




}
