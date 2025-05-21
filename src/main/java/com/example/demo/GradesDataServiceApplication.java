package com.example.demo;

import com.example.demo.model.Course;
import com.example.demo.model.Grade;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.GradeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GradesDataServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(GradesDataServiceApplication.class, args);
	}

	//    @Bean
//    public CommandLineRunner init(CourseRepository courseRepository, GradeRepository gradeRepository) {
//        return args -> {
//            Course math = courseRepository.save(new Course(null, "Matemáticas I", null));
//            Course programming = courseRepository.save(new Course(null, "Programación II", null));
//
//            gradeRepository.save(new Grade(null, 8.5, 1L, math));
//            gradeRepository.save(new Grade(null, 7.0, 2L, math));
//            gradeRepository.save(new Grade(null, 9.0, 1L, programming));
//            gradeRepository.save(new Grade(null, 6.8, 3L, math));
//        };
//    }

}
