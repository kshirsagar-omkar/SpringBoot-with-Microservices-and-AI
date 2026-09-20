package com.tca.app_03_primary_key_genration_table_auto_uuid.model;


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
    @TableGenerator(name="student_id_generator",
                    table="id_generator",
                    pkColumnName="gen_name",
                    valueColumnName="gen_value",
                    pkColumnValue="student_id",
                    initialValue=0,
                    allocationSize=1)

    @GeneratedValue(strategy=GenerationType.TABLE,
                    generator = "student_id_generator")

    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String name;
    private Double percentage;

}
