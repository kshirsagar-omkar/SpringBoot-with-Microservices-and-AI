package com.tca.app_02_primary_key_genration_sequence.repository;

import com.tca.app_02_primary_key_genration_sequence.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {




}
