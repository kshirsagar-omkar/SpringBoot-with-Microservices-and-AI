package com.tca.payload;

import com.tca.model.Student;

import java.util.List;

public class StudentListResponseDTO {
    private String batch;
    private List<Student> studentList;

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
