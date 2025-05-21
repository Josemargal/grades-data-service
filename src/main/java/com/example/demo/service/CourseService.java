package com.example.demo.service;

import com.example.demo.dto.CourseGradeDTO;
import com.example.demo.model.Course;
import com.example.demo.model.Grade;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private GradeRepository gradeRepository;


    public Course getCourseByCode(Long courseCode) {
        return courseRepository.findById(courseCode).orElse(null);
    }

    public CourseGradeDTO getCourseGrade(Long courseCode) {
        Course course = getCourseByCode(courseCode);
        if (course == null){
            return null;
        }
        List<Grade> grades = gradeRepository.findByCourse_CourseCode(courseCode);
        return new CourseGradeDTO(course.getCourseName(), grades);
    }

}
