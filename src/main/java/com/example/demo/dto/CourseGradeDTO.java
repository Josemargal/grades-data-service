package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseGradeDTO {
    private String courseCode;
    private String courseName;
    private Long studentId;
    private double grade;
}
