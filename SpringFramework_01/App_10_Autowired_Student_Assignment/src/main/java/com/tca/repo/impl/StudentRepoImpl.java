package com.tca.repo.impl;

import com.tca.model.Student;
import com.tca.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class StudentRepoImpl implements StudentRepo {

    @Autowired
    Map<String, List<Student>> map;

    @Override
    public void save(String batch, Student student) {

        if (map.containsKey(batch)) {

            // Get List and add new student

            // List<Student> students = map.get(batch);
            // students.add(student);

            map.get(batch).add(student);
        }
    }

    @Override
    public List<Student> getStudentsByBatch (String batch){

        if (map.containsKey(batch)) {
                return map.get(batch);
        }

        return Collections.emptyList();
    }

    @Override
    public Boolean verifyBatchExist(String batch) {

        return map.containsKey(batch);
    }

    @Override
    public Map<String, List<Student>> FindAll() {

        return map;
    }


}
