package com.tca.app_02_primary_key_genration_sequence.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @SequenceGenerator(name="student_id_generator",         //Name to bind with generated value
                    sequenceName = "std_seq",               //DB side created sequence name
                    allocationSize=50)                       //Must match with the Increment value of the sequence in DB
                                                            //Used for hibernate caching
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
                    generator = "student_id_generator")
    private Long id;

    private String name;
    private Double percentage;

}
