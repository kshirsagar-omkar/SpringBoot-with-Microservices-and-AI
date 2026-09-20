package com.tca.app_01_primary_key_generation_identity.repository;

import com.tca.app_01_primary_key_generation_identity.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {




}
