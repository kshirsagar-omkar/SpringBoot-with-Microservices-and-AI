package com.tca.repo;

import com.tca.model.Student;
import com.tca.payload.StudentRequestDTO;

import java.util.List;
import java.util.Map;

public interface StudentRepo {
    void save(String batch, Student student);
    List<Student> getStudentsByBatch(String batch);
    Boolean verifyBatchExist(String batch);

    Map<String, List<Student>> FindAll();
}
