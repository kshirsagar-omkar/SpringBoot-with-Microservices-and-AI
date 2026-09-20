package com.tca.controller;


import com.tca.payload.BatchWiseStudentListResponseDTO;
import com.tca.payload.StudentListResponseDTO;
import com.tca.payload.StudentRequestDTO;
import com.tca.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public void save(StudentRequestDTO requestDTO) {
        studentService.save(requestDTO);
    }

    public StudentListResponseDTO getStudentsByBatch(String batch) {
        return studentService.getStudentsByBatch(batch);
    }

    public BatchWiseStudentListResponseDTO FindAll() {
        return studentService.findAll();
    }


}
