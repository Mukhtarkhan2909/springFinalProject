package com.example.springfinalproject.service.serviceInterface;

import com.example.springfinalproject.entity.Courses;

import java.util.List;
import java.util.Optional;

public interface CourseServiceIn {
    void addCourse(Courses courses);
    void deleteCourse(Long id);
    void updateCourse(Long id, Courses courses);
    Optional<Courses> getCourseById(Long id);
    List<Courses> getAllCourses();
}
