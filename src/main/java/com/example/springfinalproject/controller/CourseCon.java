package com.example.springfinalproject.controller;

import com.example.springfinalproject.entity.Courses;
import com.example.springfinalproject.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseCon {
    @Autowired
    CourseService courseService;

    @GetMapping("/list")
    public List<Courses> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/find/{id}")
    public Courses getCourseById(@PathVariable("id") Long id) {
        return courseService.getCourseById(id).get();
    }

    @PostMapping("/create")
    public void addCourse(@RequestBody Courses courses) {
        courseService.addCourse(courses);
    }

    @PutMapping("/update/{id}")
    public void updateCourse(@PathVariable Long id,
                           @RequestBody Courses courses) {
        courseService.updateCourse(id, courses);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable("id") Long id) {
        courseService.deleteCourse(id);
    }
}
