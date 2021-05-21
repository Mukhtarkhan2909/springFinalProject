package com.example.springfinalproject.repository;

import com.example.springfinalproject.entity.Enrols;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EnrolRepo extends JpaRepository<Enrols, Long> {
    @NotNull
    List<Enrols> findAll();
    @NotNull
    Optional<Enrols> findById(@NotNull Long id);
}