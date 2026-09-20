package com.tca.app_04_primary_key_genration_custom.model;


import com.tca.app_04_primary_key_genration_custom.generator.TcaId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    /* Deprecated Version*/
//    @GenericGenerator(name="custome-generator",
//                    strategy = "com.tca.app_04_primary_key_genration_custom.generator.IdGeneratorDepricatedA0")

//    @GeneratedValue(generator = "custome-generator")

    /* New Version*/
    @TcaId(name="TEC")
    private String id;

    private String name;
    private Double percentage;

}
