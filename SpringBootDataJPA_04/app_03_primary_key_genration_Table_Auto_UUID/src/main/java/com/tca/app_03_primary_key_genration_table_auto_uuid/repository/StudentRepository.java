package com.tca.app_03_primary_key_genration_table_auto_uuid.repository;

import com.tca.app_03_primary_key_genration_table_auto_uuid.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {




}
