package com.example.demo.service;

import com.example.demo.dto.CourseGradeDTO;
import com.example.demo.model.Course;
import com.example.demo.model.Grade;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private GradeRepository gradeRepository;

    public Optional<Course> getCourseByCode(String courseCode) {
        return courseRepository.findById(courseCode);
    }

    public List<CourseGradeDTO> getGradesByCourseCode(String courseCode) {
        List<Grade> grades = gradeRepository.findByCourseCode(courseCode);

        return grades.stream()
                .map(grade -> new CourseGradeDTO(
                        grade.getCourse().getCourseCode(),
                        grade.getCourse().getCourseName(),
                        grade.getStudentId(),
                        grade.getGrade()
                ))
                .collect(Collectors.toList());
    }
}
