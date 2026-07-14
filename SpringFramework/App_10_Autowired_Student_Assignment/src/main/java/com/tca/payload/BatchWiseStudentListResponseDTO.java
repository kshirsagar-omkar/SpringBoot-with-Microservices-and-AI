package com.tca.payload;

import com.tca.model.Student;

import java.util.List;
import java.util.Map;

public class BatchWiseStudentListResponseDTO {
    Map<String, List<Student>> map;

    public Map<String, List<Student>> getMap() {
        return map;
    }

    public void setMap(Map<String, List<Student>> map) {
        this.map = map;
    }
}
