package com.tca.app_03_dml_using_query_annotation.model;



import com.tca.app_03_dml_using_query_annotation.enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {

    @Id
    private Long id;

    private String name;

    private Double percentage;

    private String city;

    private Gender gender;
}
