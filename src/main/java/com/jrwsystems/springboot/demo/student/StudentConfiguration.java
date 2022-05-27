package com.jrwsystems.springboot.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository studentRepository){
        return args -> {
            Student jackson = new Student (
                     "Jackson", LocalDate.of(1979, Month.OCTOBER, 10),
                    "jrwippel@hotmail.com"
            );
           Student james = new Student(
                    "James", LocalDate.of(1974, Month.APRIL, 1),
                    "james.bond@hotmail.com"
            );

           Student davi = new Student(
                    "Davi", LocalDate.of(2012, Month.DECEMBER, 05),
                    "davi.wipppe@gmial.com"
           );
           studentRepository.saveAll(
                   List.of(jackson, james, davi)
           );
        };
    }
}
