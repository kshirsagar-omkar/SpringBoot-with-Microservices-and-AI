package com.tca.config;



import com.tca.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "com.tca")
public class AppConfig {


    @Bean
    Map<String, List<Student>> getStudentMap(){
        Map<String, List<Student>> map = new HashMap<>();

        List<Student> sb_01 = new ArrayList<>();
        sb_01.add(new Student("1", "omkar", 56.60));
        sb_01.add(new Student("2", "vaibhav", 90.00));

        List<Student> sb_02 = new ArrayList<>();
        sb_02.add(new Student("3", "kar", 90.00));
        sb_02.add(new Student("4", "om", 90.00));

        map.put("sb_01",  sb_01);
        map.put("sb_02",  sb_02);

        return map;



    }

}
