package com.example.springfinalproject.service;

import com.example.springfinalproject.entity.Courses;
import com.example.springfinalproject.repository.CourseRepo;
import com.example.springfinalproject.service.serviceInterface.CourseServiceIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CourseServiceIn {
    @Autowired
    private CourseRepo courseRepo;

    @Override
    public void addCourse(Courses courses) {
        courseRepo.saveAndFlush(courses);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }

    @Override
    public void updateCourse(Long id, Courses courses) {
        courses.setId(id);
        courseRepo.saveAndFlush(courses);
    }

    @Override
    public Optional<Courses> getCourseById(Long id) {
        return courseRepo.findById(id);
    }

    @Override
    public List<Courses> getAllCourses() {
        return courseRepo.findAll();
    }
}
