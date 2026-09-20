package com.tca.app_06_manytoonebidirection.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Long studentId;

    private String name;
    private Double percentage;


    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "student")
    private List<Course> courses;

}