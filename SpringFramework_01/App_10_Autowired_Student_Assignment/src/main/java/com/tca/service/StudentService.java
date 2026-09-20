package com.tca.service;

import com.tca.payload.BatchWiseStudentListResponseDTO;
import com.tca.payload.StudentListResponseDTO;
import com.tca.payload.StudentRequestDTO;

public interface StudentService {
    void save(StudentRequestDTO requestDTO);
    StudentListResponseDTO getStudentsByBatch(String batch);
    BatchWiseStudentListResponseDTO findAll();
}
