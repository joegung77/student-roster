package com.jgung.studentroster.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21);
            Student joe = new Student("Joe", "joegung77@yahoo.com", LocalDate.of(2002, Month.JANUARY, 21), 20);
            Student wendy = new Student("Wendy", "wendygong@gmail.com", LocalDate.of(2012, Month.JANUARY, 1), 9);
            repository.saveAll(List.of(mariam,joe,wendy));
        };

    }
}
