package com.tca.service.impl;

import com.tca.model.Student;
import com.tca.payload.BatchWiseStudentListResponseDTO;
import com.tca.payload.StudentListResponseDTO;
import com.tca.payload.StudentRequestDTO;
import com.tca.repo.StudentRepo;
import com.tca.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public void save(StudentRequestDTO requestDTO) {

        if (!studentRepo.verifyBatchExist(requestDTO.getBatch())) {
            throw new RuntimeException("Batch does not exist");
        }


        Student student = new Student();
        student.setName(requestDTO.getName());
        student.setCity(requestDTO.getCity());
        student.setPer(requestDTO.getPer());

        String batch = requestDTO.getBatch();

        studentRepo.save(batch, student);
    }







    @Override
    public StudentListResponseDTO getStudentsByBatch(String batch) {



        if(!studentRepo.verifyBatchExist(batch)){
            throw new RuntimeException("Batch does not exist: " + batch);
        }

        List<Student> students = studentRepo.getStudentsByBatch(batch);
        if(students==null){
            throw new RuntimeException("No students found for batch: " + batch);
        }

        StudentListResponseDTO  studentListResponseDTO = new StudentListResponseDTO();
        studentListResponseDTO.setStudentList(students);
        studentListResponseDTO.setBatch(batch);

        return studentListResponseDTO;

    }

    @Override
    public BatchWiseStudentListResponseDTO findAll() {

        Map<String, List<Student>> map = studentRepo.FindAll();
        if (map == null || map.isEmpty()) {
            throw new RuntimeException("No students found");
        }

        BatchWiseStudentListResponseDTO batchWiseStudentListResponseDTO = new BatchWiseStudentListResponseDTO();
        batchWiseStudentListResponseDTO.setMap(map);

        return batchWiseStudentListResponseDTO;

    }
}
