package com.example.springfinalproject.repository;

import com.example.springfinalproject.entity.Courses;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepo extends JpaRepository<Courses, Long> {
    @NotNull
    List<Courses> findAll();
    @NotNull
    Optional<Courses> findById(@NotNull Long id);
}